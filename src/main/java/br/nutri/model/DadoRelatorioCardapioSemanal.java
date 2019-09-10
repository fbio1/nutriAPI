package br.nutri.model;

public class DadoRelatorioCardapioSemanal {
	private String nomePreparacao;

	public DadoRelatorioCardapioSemanal() {
	}

	public DadoRelatorioCardapioSemanal(String nomePreparacao) {
		this.nomePreparacao = nomePreparacao;
	}

	public String getNomePreparacao() {
		return nomePreparacao;
	}

	public void setNomePreparacao(String nomePreparacao) {
		this.nomePreparacao = nomePreparacao;
	}
}
