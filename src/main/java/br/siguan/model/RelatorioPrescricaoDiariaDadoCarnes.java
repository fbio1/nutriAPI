package br.siguan.model;

import java.util.ArrayList;
import java.util.List;

public class RelatorioPrescricaoDiariaDadoCarnes {
	public boolean preenchida = false;
	private String nomePreparacao;
	private List<RelatorioPrescricaoDiariaCarnesInsumo> listaInsumo = new ArrayList<>();

	public RelatorioPrescricaoDiariaDadoCarnes() {
	}

	public RelatorioPrescricaoDiariaDadoCarnes(String nomePreparacao) {
		this.nomePreparacao = nomePreparacao;
	}

	public String getNomePreparacao() {
		return nomePreparacao;
	}

	public void setNomePreparacao(String nomePreparacao) {
		this.nomePreparacao = nomePreparacao;
	}

	public List<RelatorioPrescricaoDiariaCarnesInsumo> getListaInsumo() {
		return listaInsumo;
	}

	public void setListaInsumo(List<RelatorioPrescricaoDiariaCarnesInsumo> listaInsumo) {
		this.listaInsumo = listaInsumo;
	}
}
