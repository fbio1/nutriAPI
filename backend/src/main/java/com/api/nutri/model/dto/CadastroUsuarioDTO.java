package com.api.nutri.model.dto;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.api.nutri.model.enuns.TipoUsuario;

public class CadastroUsuarioDTO {
	private Integer id;

	@NotEmpty(message = "O campo email não pode ser nulo.")
	@Email(message = "O campo email é inválido.")
	private String email;

	@NotEmpty(message = "O campo nome não pode ser nulo.")
	private String nome;

	@NotEmpty(message = "O campo login não pode ser nulo.")
	private String login;

	@NotEmpty(message = "O campo senha não pode ser nulo.")
	private String senha;

	@Column(name = "tipo", nullable = false)
	@Enumerated(EnumType.STRING)
	@NotNull(message = "Por favor, informe o tipo de usuário!")
	private TipoUsuario tipo;

	private String imagem;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
}
