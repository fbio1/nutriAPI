package br.siguan.model;

import java.util.ArrayList;
import java.util.List;

public class RelatorioPrescricaoDiariaCarnes {
	// 6 listas de refeiçao que faz referencia ao serviço de relatorio da sala de carnes

	private String dataPesquisada;
	private List<RelatorioPrescricaoDiariaDadoCarnes> desjejum = new ArrayList<>();
	private List<RelatorioPrescricaoDiariaDadoCarnes> lanche_manha = new ArrayList<>();
	private List<RelatorioPrescricaoDiariaDadoCarnes> almoco = new ArrayList<>();
	private List<RelatorioPrescricaoDiariaDadoCarnes> lanche_tarde = new ArrayList<>();
	private List<RelatorioPrescricaoDiariaDadoCarnes> jantar = new ArrayList<>();
	private List<RelatorioPrescricaoDiariaDadoCarnes> ceia = new ArrayList<>();

	public RelatorioPrescricaoDiariaCarnes(String dataPesquisada) {
		this.dataPesquisada = dataPesquisada;
	}

	public RelatorioPrescricaoDiariaCarnes() {
	}

	public String getDataPesquisada() {
		return dataPesquisada;
	}

	public void setDataPesquisada(String dataPesquisada) {
		this.dataPesquisada = dataPesquisada;
	}

	public List<RelatorioPrescricaoDiariaDadoCarnes> getDesjejum() {
		return desjejum;
	}

	public void setDesjejum(List<RelatorioPrescricaoDiariaDadoCarnes> desjejum) {
		this.desjejum = desjejum;
	}

	public List<RelatorioPrescricaoDiariaDadoCarnes> getLanche_manha() {
		return lanche_manha;
	}

	public void setLanche_manha(List<RelatorioPrescricaoDiariaDadoCarnes> lanche_manha) {
		this.lanche_manha = lanche_manha;
	}

	public List<RelatorioPrescricaoDiariaDadoCarnes> getAlmoco() {
		return almoco;
	}

	public void setAlmoco(List<RelatorioPrescricaoDiariaDadoCarnes> almoco) {
		this.almoco = almoco;
	}

	public List<RelatorioPrescricaoDiariaDadoCarnes> getLanche_tarde() {
		return lanche_tarde;
	}

	public void setLanche_tarde(List<RelatorioPrescricaoDiariaDadoCarnes> lanche_tarde) {
		this.lanche_tarde = lanche_tarde;
	}

	public List<RelatorioPrescricaoDiariaDadoCarnes> getJantar() {
		return jantar;
	}

	public void setJantar(List<RelatorioPrescricaoDiariaDadoCarnes> jantar) {
		this.jantar = jantar;
	}

	public List<RelatorioPrescricaoDiariaDadoCarnes> getCeia() {
		return ceia;
	}

	public void setCeia(List<RelatorioPrescricaoDiariaDadoCarnes> ceia) {
		this.ceia = ceia;
	}
}
