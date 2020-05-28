package com.api.seguranca.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.api.nutri.model.Login;
import com.api.nutri.repository.LoginRepository;
import com.api.seguranca.JwtUserFactory;

@Service("userDetailsService")
public class JwtUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Login> login = this.loginRepository.findByloginAndActiveIsTrue(username);

		if (login.isPresent()) {
			return JwtUserFactory.create(login.get());
		}

		throw new UsernameNotFoundException("Username não Encontrado.");
	}

}
