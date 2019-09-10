package br.nutri.model;

import java.util.ArrayList;
import java.util.List;

public class RelatorioPrescricao {
	private String nomePreparacao;
	private int previsao;
	private String modoPreparo;
	private List<ItensRelatoriosPrescricao> itensRelatoriosPrescricao = new ArrayList<>();
	private List<ItensRelatoriosPrescricaoVegetais> itensRelatoriosPrescricaoVegetais = new ArrayList<>();

	public RelatorioPrescricao() {
	}

	public RelatorioPrescricao(String nomePreparacao, int previsao, String modoPreparo) {
		this.nomePreparacao = nomePreparacao;
		this.previsao = previsao;
		this.modoPreparo = modoPreparo;
	}

	public String getNomePreparacao() {
		return nomePreparacao;
	}

	public void setNomePreparacao(String nomePreparacao) {
		this.nomePreparacao = nomePreparacao;
	}

	public int getPrevisao() {
		return previsao;
	}

	public void setPrevisao(int previsao) {
		this.previsao = previsao;
	}

	public List<ItensRelatoriosPrescricao> getItensRelatoriosPrescricao() {
		return itensRelatoriosPrescricao;
	}

	public void setItensRelatoriosPrescricao(List<ItensRelatoriosPrescricao> itensRelatoriosPrescricao) {
		this.itensRelatoriosPrescricao = itensRelatoriosPrescricao;
	}

	public List<ItensRelatoriosPrescricaoVegetais> getItensRelatoriosPrescricaoVegetais() {
		return itensRelatoriosPrescricaoVegetais;
	}

	public void setItensRelatoriosPrescricaoVegetais(
			List<ItensRelatoriosPrescricaoVegetais> itensRelatoriosPrescricaoVegetais) {
		this.itensRelatoriosPrescricaoVegetais = itensRelatoriosPrescricaoVegetais;
	}

	public String getModoPreparo() {
		return modoPreparo;
	}

	public void setModoPreparo(String modoPreparo) {
		this.modoPreparo = modoPreparo;
	}
}
