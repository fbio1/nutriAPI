package br.siguan.model;

import java.util.ArrayList;
import java.util.List;

public class ListaRelatorioPrescricao {
	private String data;
	private List<RelatorioPrescricao> desjejum = new ArrayList<RelatorioPrescricao>();
	private List<RelatorioPrescricao> lache_manha = new ArrayList<RelatorioPrescricao>();
	private List<RelatorioPrescricao> almoco = new ArrayList<RelatorioPrescricao>();
	private List<RelatorioPrescricao> lanche_tarde = new ArrayList<RelatorioPrescricao>();
	private List<RelatorioPrescricao> jantar = new ArrayList<RelatorioPrescricao>();
	private List<RelatorioPrescricao> ceia = new ArrayList<RelatorioPrescricao>();

	public ListaRelatorioPrescricao() {
	}

	public ListaRelatorioPrescricao(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<RelatorioPrescricao> getDesjejum() {
		return desjejum;
	}

	public void setDesjejum(List<RelatorioPrescricao> desjejum) {
		this.desjejum = desjejum;
	}

	public List<RelatorioPrescricao> getLache_manha() {
		return lache_manha;
	}

	public void setLache_manha(List<RelatorioPrescricao> lache_manha) {
		this.lache_manha = lache_manha;
	}

	public List<RelatorioPrescricao> getAlmoco() {
		return almoco;
	}

	public void setAlmoco(List<RelatorioPrescricao> almoco) {
		this.almoco = almoco;
	}

	public List<RelatorioPrescricao> getLanche_tarde() {
		return lanche_tarde;
	}

	public void setLanche_tarde(List<RelatorioPrescricao> lanche_tarde) {
		this.lanche_tarde = lanche_tarde;
	}

	public List<RelatorioPrescricao> getJantar() {
		return jantar;
	}

	public void setJantar(List<RelatorioPrescricao> jantar) {
		this.jantar = jantar;
	}

	public List<RelatorioPrescricao> getCeia() {
		return ceia;
	}

	public void setCeia(List<RelatorioPrescricao> ceia) {
		this.ceia = ceia;
	}

}
