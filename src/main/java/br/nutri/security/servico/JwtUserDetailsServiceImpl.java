package br.nutri.security.servico;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.nutri.model.Login;
import br.nutri.repository.LoginRepository;
import br.nutri.security.JwtUserFactory;

@Service("userDetailsService")
public class JwtUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Login> login = this.loginRepository.findByloginAndAtivoTrue(username);

		if (login.isPresent()) {
			return JwtUserFactory.create(login.get());
		}

		throw new UsernameNotFoundException("Username não Encontrado.");
	}

}
