package br.nutri.model;

public class RelatorioPrescricaoDiariaCarnesInsumo {
	private String nomeInsumo;
	private double peso;
	private String nomeCorte;
	private String descricaoCorte;
	private Unidade unidade;

	public RelatorioPrescricaoDiariaCarnesInsumo() {
	}

	public RelatorioPrescricaoDiariaCarnesInsumo(String nomeInsumo, double peso, String nomeCorte,
			String descricaoCorte, Unidade unidade) {
		this.nomeInsumo = nomeInsumo;
		this.peso = peso;
		this.nomeCorte = nomeCorte;
		this.descricaoCorte = descricaoCorte;
		this.unidade = unidade;
	}

	public RelatorioPrescricaoDiariaCarnesInsumo(String nomeInsumo, double peso, Unidade unidade) {
		this.nomeInsumo = nomeInsumo;
		this.peso = peso;
		this.unidade = unidade;
	}

	public String getNomeInsumo() {
		return nomeInsumo;
	}

	public void setNomeInsumo(String nomeInsumo) {
		this.nomeInsumo = nomeInsumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNomeCorte() {
		return nomeCorte;
	}

	public void setNomeCorte(String nomeCorte) {
		this.nomeCorte = nomeCorte;
	}

	public String getDescricaoCorte() {
		return descricaoCorte;
	}

	public void setDescricaoCorte(String descricaoCorte) {
		this.descricaoCorte = descricaoCorte;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

}
