package br.nutri.model.enuns;

public enum TipoUsuario {
	NUTRICIONISTA(1), ALMOXARIFE(2), ESTAGIARIO(3);
	
	private Integer codigo;

	private TipoUsuario(Integer codigo) {
		this.codigo = codigo;	
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public static TipoUsuario porCodigo(Integer codigo) {
		if (codigo.equals(null)) {
			return null;
		}

		for (TipoUsuario tipo : TipoUsuario.values()) {
			if (codigo.equals(tipo.getCodigo())) {
				return tipo;
			}
		}
		throw new IllegalArgumentException("Código Inválido: " + codigo);
	}
}