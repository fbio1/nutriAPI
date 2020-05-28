package com.api.nutri.model;

import java.util.Date;

public class DadoMapaDegelo {
	private String dataDescongelamento;
	private String dataPrePreparo;
	private Date dataconsumo;
	private double quantidade;
	private String insumoRetirado;
	private double percapita;
	private int previsaoComensais;

	public DadoMapaDegelo() {
	}

	public DadoMapaDegelo(String dataDescongelamento, String dataPrePreparo, Date dataconsumo, double quantidade,
			String insumoRetirado, double percapita, int previsaoComensais) {
		this.dataDescongelamento = dataDescongelamento;
		this.dataPrePreparo = dataPrePreparo;
		this.dataconsumo = dataconsumo;
		this.quantidade = quantidade;
		this.insumoRetirado = insumoRetirado;
		this.percapita = percapita;
		this.previsaoComensais = previsaoComensais;
	}

	public String getDataDescongelamento() {
		return dataDescongelamento;
	}

	public void setDataDescongelamento(String dataDescongelamento) {
		this.dataDescongelamento = dataDescongelamento;
	}

	public String getDataPrePreparo() {
		return dataPrePreparo;
	}

	public void setDataPrePreparo(String dataPrePreparo) {
		this.dataPrePreparo = dataPrePreparo;
	}

	public Date getDataconsumo() {
		return dataconsumo;
	}

	public void setDataconsumo(Date dataconsumo) {
		this.dataconsumo = dataconsumo;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public String getInsumoRetirado() {
		return insumoRetirado;
	}

	public void setInsumoRetirado(String insumoRetirado) {
		this.insumoRetirado = insumoRetirado;
	}

	public double getPercapita() {
		return percapita;
	}

	public void setPercapita(double percapita) {
		this.percapita = percapita;
	}

	public int getPrevisaoComensais() {
		return previsaoComensais;
	}

	public void setPrevisaoComensais(int previsaoComensais) {
		this.previsaoComensais = previsaoComensais;
	}
}