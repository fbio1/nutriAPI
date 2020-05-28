package com.api.seguranca;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.api.nutri.model.Login;
import com.api.nutri.model.enuns.TipoUsuario;

public class JwtUserFactory {

	private JwtUserFactory() {

	}

	public static JwtUser create(Login login) {
		return new JwtUser(login.getId(), login.getLogin(), login.getSenha(),
				mapToGrantedAuthorities(login.getUsuario().getTipo()));

	}

	private static List<GrantedAuthority> mapToGrantedAuthorities(TipoUsuario perfilEnum) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(perfilEnum.toString()));
		return authorities;

	}

}
