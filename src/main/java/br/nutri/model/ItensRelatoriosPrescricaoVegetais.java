package br.nutri.model;

public class ItensRelatoriosPrescricaoVegetais {
	private String nomeInsumo;
	private double quantidade;
	private Unidade unidade;
	private String corte;
	private String obsInsumo;

	public ItensRelatoriosPrescricaoVegetais(String nomeInsumo, double quantidade, Unidade unidade, String corte,
			String obsInsumo) {
		this.nomeInsumo = nomeInsumo;
		this.quantidade = quantidade;
		this.unidade = unidade;
		this.corte = corte;
		this.obsInsumo = obsInsumo;
	}

	public String getObsInsumo() {
		return obsInsumo;
	}

	public void setObsInsumo(String obsInsumo) {
		this.obsInsumo = obsInsumo;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public ItensRelatoriosPrescricaoVegetais() {
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

	public String getCorte() {
		return corte;
	}

	public void setCorte(String corte) {
		this.corte = corte;
	}
}
