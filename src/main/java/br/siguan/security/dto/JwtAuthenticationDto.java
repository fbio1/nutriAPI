package br.siguan.security.dto;

import javax.validation.constraints.NotEmpty;

public class JwtAuthenticationDto {

	@NotEmpty(message = "Login não pode ser vazio.")
	private String login;

	@NotEmpty(message = "Senha não pode ser vazio.")
	private String senha;

	public JwtAuthenticationDto() {
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
