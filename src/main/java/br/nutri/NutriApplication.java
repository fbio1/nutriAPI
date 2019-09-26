package br.nutri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.nutri.model.Login;
import br.nutri.model.Usuario;
import br.nutri.model.enuns.TipoUsuario;
import br.nutri.repository.LoginRepository;
import br.nutri.utils.PasswordUtils;

@SpringBootApplication
public class NutriApplication {

	public static void main(String[] args) {
		SpringApplication.run(NutriApplication.class, args);
	}
	
//	@Autowired
//	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private LoginRepository loginRepository;
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			Usuario usuario = new Usuario();
			usuario.setNome("nome");
			usuario.setEmail("email@gmail.com");
			usuario.setTipo(TipoUsuario.NUTRICIONISTA);
			usuario.setImagem("imagem");		
			Login login = new Login();
			login.setLogin("teste");
			login.setSenha(PasswordUtils.gerarBCrypt("teste"));
			login.setUsuario(usuario);
			loginRepository.save(login);
		};
	}

}
