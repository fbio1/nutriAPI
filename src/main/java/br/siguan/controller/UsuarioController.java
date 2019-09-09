package br.siguan.controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.siguan.helper.PasswordUtils;
import br.siguan.helper.Response;
import br.siguan.model.Login;
import br.siguan.model.Usuario;
import br.siguan.model.dto.CadastroUsuarioDTO;
import br.siguan.repository.LoginRepository;
import br.siguan.repository.UsuarioRepository;

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
	public ResponseEntity<Response<CadastroUsuarioDTO>> cadastrarCliente(
			@Valid @RequestBody CadastroUsuarioDTO usuarioDto, BindingResult result) throws NoSuchAlgorithmException {

		Response<CadastroUsuarioDTO> response = new Response<CadastroUsuarioDTO>();

		//validarDadosExistentes(usuarioDto, result);

		Usuario user = this.converterDtoParaUsuario(usuarioDto);

		Login login = this.converterDtoParaLogin(usuarioDto, result);

		if (result.hasErrors()) {
			return ResponseEntity.badRequest().body(response);
		}

//		this.usuarioRepository.save(user);
		login.setUsuario(user);
		this.loginRepository.save(login);
		response.setData(this.converterCadastroDTO(login));
		
		return ResponseEntity.ok(response);
	}
	
//	private void validarDadosExistentes(CadastroUsuarioDTO usuarioDTO, BindingResult result) {
//
//		Login login = this.loginRepository.findByloginAndAtivoTrue(usuarioDTO.getLogin());
//		
//	}
	
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
		login.setSenha(usuarioDTO.getSenha());
//		login.setSenha(PasswordUtils.gerarBCrypt(usuarioDTO.getSenha()));
		return login;
	}
	
	private CadastroUsuarioDTO converterCadastroDTO(Login credencial) {
		CadastroUsuarioDTO usuarioDTO = new CadastroUsuarioDTO();

		usuarioDTO.setId(credencial.getId());
		usuarioDTO.setLogin(credencial.getLogin());
		usuarioDTO.setNome(credencial.getUsuario().getNome());
		usuarioDTO.setEmail(credencial.getUsuario().getEmail());
		usuarioDTO.setTipo(credencial.getUsuario().getTipo());
		usuarioDTO.setImagem(credencial.getUsuario().getImagem());
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

//	@PutMapping(value = "{id}")
//	public ResponseEntity<Response<Usuario>> atualizarCliente(@PathVariable("id") Integer id,
//			@Valid @RequestBody Usuario usuario, BindingResult result) throws NoSuchAlgorithmException {
//
//		Response<Usuario> response = new Response<Usuario>();
//
//		Optional<Usuario> oldUsuario = this.usuarioRepository.findById(id);
//
//		if (!oldUsuario.isPresent()) {			
//			result.addError(new ObjectError("usuario", "Usuario não encontrado."));
//			return ResponseEntity.badRequest().body(response);
//		}
//
//		this.atualizarDadosCliente(oldUsuario.get(), usuario, result);
//
//		if (result.hasErrors()) {			
//			result.getAllErrors().forEach(error -> response.getErros().add(error.getDefaultMessage()));
//			return ResponseEntity.badRequest().body(response);
//		}
//
//		this.usuarioRepository.save(oldUsuario.get());
//		
//		response.setData(oldUsuario.get());
//
//		return ResponseEntity.ok(response);
//
//	}

	@DeleteMapping(value = "{id}")
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
	
//	private void validarDadosExistentes(Usuario usuario, BindingResult result) {
//
//		this.usuarioRepository.findByUsernameAndAtivoTrue(usuario.getUsername())
//				.ifPresent(cre -> result.addError(new ObjectError("usuario", "Username já existente")));
//
//	}
//	
//	private void atualizarDadosCliente(Usuario oldUsuario, Usuario newUsuario, BindingResult result)
//			throws NoSuchAlgorithmException {
//
//		if (!oldUsuario.getEmail().equals(newUsuario.getEmail())) {
//
//			this.usuarioRepository.findByEmailAndAtivoTrue(newUsuario.getEmail())
//					.ifPresent(clien -> result.addError(new ObjectError("email", "Email já exitente.")));
//			oldUsuario.setEmail(newUsuario.getEmail());
//		}			
//
//		if (newUsuario.getUsername() != null || newUsuario.getSenha() != null) {
//
//			if (!oldUsuario.getUsername().equals(newUsuario.getUsername())) {
//
//				this.usuarioRepository.findByUsernameAndAtivoTrue(newUsuario.getUsername())
//						.ifPresent(clien -> result.addError(new ObjectError("username", "Username já exitente.")));
//				oldUsuario.setUsername(newUsuario.getUsername());
//			}	
//
//			oldUsuario.setSenha(PasswordUtils.gerarBCrypt(newUsuario.getSenha()));
//
//		} else {
//			oldUsuario.setUsername(oldUsuario.getUsername());
//			oldUsuario.setSenha(oldUsuario.getSenha());
//		}
//	}
}
