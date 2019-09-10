package br.siguan.security.dto;

public class TokenDto {

	private String token;
	private String perfil;
	private int id;

	public TokenDto() {
	}

	public TokenDto(String token, String perfil, int id) {
		this.token = token;
		this.perfil = perfil;
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
