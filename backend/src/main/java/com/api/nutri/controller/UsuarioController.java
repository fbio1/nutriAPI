package com.api.nutri.controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.nutri.model.Login;
import com.api.nutri.model.Usuario;
import com.api.nutri.model.dto.CadastroUsuarioDTO;
import com.api.nutri.repository.LoginRepository;
import com.api.nutri.repository.UsuarioRepository;
import com.api.nutri.utils.PasswordUtils;
import com.api.nutri.utils.Response;

@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private LoginRepository loginRepository;

	@GetMapping
	public List<Usuario> listarClientes() {
		List<Usuario> usuarios = this.usuarioRepository.findAll();
		return usuarios;
	}
	
	//@PreAuthorize("hasAnyRole('ADMINISTRADOR','BOLSISTA')")
	@PostMapping
	@Transactional
	public ResponseEntity<Response<CadastroUsuarioDTO>> cadastrarCliente(
			@Valid @RequestBody CadastroUsuarioDTO usuarioDto, BindingResult result) throws NoSuchAlgorithmException {

		Response<CadastroUsuarioDTO> response = new Response<CadastroUsuarioDTO>();

		validarDadosExistentes(usuarioDto, result);

		Usuario user = this.converterDtoParaUsuario(usuarioDto);

		Login login = this.converterDtoParaLogin(usuarioDto, result);

		if (result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErros().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}
		
		login.setUsuario(user);
		//Cascata salva usuário e o login
		this.loginRepository.save(login);
		response.setData(this.converterCadastroDTO(login));
		
		return ResponseEntity.ok(response);
	}
	
	private void validarDadosExistentes(CadastroUsuarioDTO usuarioDTO, BindingResult result) {
		this.loginRepository.findByloginAndActiveIsTrue(usuarioDTO.getLogin()).ifPresent(login -> result.addError(new ObjectError("login", "Login já existente!")));
	}
	
	private Usuario converterDtoParaUsuario(CadastroUsuarioDTO usuarioDTO) {
		Usuario user = new Usuario();
		user.setEmail(usuarioDTO.getEmail());
		user.setNome(usuarioDTO.getNome());
		user.setTipo(usuarioDTO.getTipo());
		user.setImagem(usuarioDTO.getImagem());

		return (Usuario) user;
	}

	private Login converterDtoParaLogin(CadastroUsuarioDTO usuarioDTO, BindingResult result)
			throws NoSuchAlgorithmException {
		Login login = new Login();
		login.setLogin(usuarioDTO.getLogin());
		login.setSenha(PasswordUtils.gerarBCrypt(usuarioDTO.getSenha()));
		return login;
	}
	
	private CadastroUsuarioDTO converterCadastroDTO(Login login) {
		CadastroUsuarioDTO usuarioDTO = new CadastroUsuarioDTO();
		usuarioDTO.setId(login.getId());
		usuarioDTO.setLogin(login.getLogin());
		usuarioDTO.setNome(login.getUsuario().getNome());
		usuarioDTO.setEmail(login.getUsuario().getEmail());
		usuarioDTO.setTipo(login.getUsuario().getTipo());
		usuarioDTO.setImagem(login.getUsuario().getImagem());
		return usuarioDTO;
	}

	@GetMapping(value = "{id}")
	public ResponseEntity<Response<Usuario>> buscarClientePorId(@PathVariable("id") Integer id) {
		Response<Usuario> response = new Response<Usuario>();
		
		Optional<Usuario> usuario = this.usuarioRepository.findById(id);

		if (!usuario.isPresent()) {
			response.getErros().add("Usuário não encontrado");
			return ResponseEntity.badRequest().body(response);
		}

		response.setData(usuario.get());

		return ResponseEntity.ok(response);
	}

	@PutMapping(value = "{id}")
	public ResponseEntity<Response<CadastroUsuarioDTO>> atualizarCliente(@PathVariable("id") Integer id,
			@Valid @RequestBody CadastroUsuarioDTO usuarioDTO, BindingResult result) throws NoSuchAlgorithmException {

		Response<CadastroUsuarioDTO> response = new Response<CadastroUsuarioDTO>();

		Optional<Login> login = this.loginRepository.findById(id);

		if (!login.isPresent()) {
			result.addError(new ObjectError("login", "Login não encontrado!"));
		}

		this.atualizarDados(login.get(), usuarioDTO, result);

		if (result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErros().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}

		this.loginRepository.save(login.get());
		response.setData(this.converterCadastroDTO(login.get()));

		return ResponseEntity.ok(response);
	}
	
	private void atualizarDados(Login login, CadastroUsuarioDTO usuarioDTO, BindingResult result)
			throws NoSuchAlgorithmException {

		login.getUsuario().setNome(usuarioDTO.getNome());

		if (!login.getUsuario().getEmail().equals(usuarioDTO.getEmail())) {

			this.usuarioRepository.findByEmailAndActiveIsTrue(usuarioDTO.getEmail())
					.ifPresent(clien -> result.addError(new ObjectError("email", "Email já exitente.")));
			login.getUsuario().setEmail(usuarioDTO.getEmail());
		}
		
		if (usuarioDTO.getLogin() != null || usuarioDTO.getSenha() != null) {

			if (!login.getLogin().equals(usuarioDTO.getLogin())) {
				this.loginRepository.findByloginAndActiveIsTrue(usuarioDTO.getLogin())
						.ifPresent(lo -> result.addError(new ObjectError("username", "Username já existente.")));
				login.setLogin(usuarioDTO.getLogin());
			}

			login.setSenha(PasswordUtils.gerarBCrypt(usuarioDTO.getSenha()));

		} else {
			login.setLogin(login.getLogin());
			login.setSenha(login.getSenha());

		}
	}

	@DeleteMapping(value = "{id}")
	@Transactional
	public ResponseEntity<Response<Usuario>> deletarCliente(@PathVariable("id") Integer id) {
		Response<Usuario> response = new Response<Usuario>();

		Optional<Usuario> usuario = this.usuarioRepository.findById(id);

		if (!usuario.isPresent()) {		
			response.getErros().add("Usuario não encontrado");
			return ResponseEntity.badRequest().body(response);
		}

		response.setData(usuario.get());

		this.usuarioRepository.deleteById(usuario.get().getId());

		return ResponseEntity.ok(response);
	}
}
