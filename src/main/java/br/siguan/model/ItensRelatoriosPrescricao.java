package br.siguan.model;

public class ItensRelatoriosPrescricao {
	private String nomeInsumo;
	private double quantidade;
	private Unidade unidade;
	private String obsInsumo;

	public ItensRelatoriosPrescricao(String nomeInsumo, double quantidade, Unidade unidade, String obsInsumo) {
		this.nomeInsumo = nomeInsumo;
		this.quantidade = quantidade;
		this.unidade = unidade;
		this.obsInsumo = obsInsumo;
	}

	public ItensRelatoriosPrescricao() {
	}

	public String getNomeInsumo() {
		return nomeInsumo;
	}

	public void setNomeInsumo(String nomeInsumo) {
		this.nomeInsumo = nomeInsumo;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public String getObsInsumo() {
		return obsInsumo;
	}

	public void setObsInsumo(String obsInsumo) {
		this.obsInsumo = obsInsumo;
	}
}
