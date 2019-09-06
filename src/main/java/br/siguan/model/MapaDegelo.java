package br.siguan.model;

import java.util.ArrayList;
import java.util.List;

public class MapaDegelo {
	private String dataPesquisada;
	private List<DadoMapaDegelo> desjejum = new ArrayList<DadoMapaDegelo>();
	private List<DadoMapaDegelo> lanche_manha = new ArrayList<DadoMapaDegelo>();
	private List<DadoMapaDegelo> almoco = new ArrayList<DadoMapaDegelo>();
	private List<DadoMapaDegelo> lanche_tarde = new ArrayList<DadoMapaDegelo>();
	private List<DadoMapaDegelo> jantar = new ArrayList<DadoMapaDegelo>();
	private List<DadoMapaDegelo> ceia = new ArrayList<DadoMapaDegelo>();

	public MapaDegelo() {
	}

	public MapaDegelo(String dataPesquisada) {
		this.dataPesquisada = dataPesquisada;
	}

	public String getDataPesquisada() {
		return dataPesquisada;
	}

	public void setDataPesquisada(String dataPesquisada) {
		this.dataPesquisada = dataPesquisada;
	}

	public List<DadoMapaDegelo> getDesjejum() {
		return desjejum;
	}

	public void setDesjejum(List<DadoMapaDegelo> desjejum) {
		this.desjejum = desjejum;
	}

	public List<DadoMapaDegelo> getLanche_manha() {
		return lanche_manha;
	}

	public void setLanche_manha(List<DadoMapaDegelo> lanche_manha) {
		this.lanche_manha = lanche_manha;
	}

	public List<DadoMapaDegelo> getAlmoco() {
		return almoco;
	}

	public void setAlmoco(List<DadoMapaDegelo> almoco) {
		this.almoco = almoco;
	}

	public List<DadoMapaDegelo> getLanche_tarde() {
		return lanche_tarde;
	}

	public void setLanche_tarde(List<DadoMapaDegelo> lanche_tarde) {
		this.lanche_tarde = lanche_tarde;
	}

	public List<DadoMapaDegelo> getJantar() {
		return jantar;
	}

	public void setJantar(List<DadoMapaDegelo> jantar) {
		this.jantar = jantar;
	}

	public List<DadoMapaDegelo> getCeia() {
		return ceia;
	}

	public void setCeia(List<DadoMapaDegelo> ceia) {
		this.ceia = ceia;
	}
}
