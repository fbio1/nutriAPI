package br.nutri.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RelatorioCardapioSemanal {

	private Date dataMenu;// Data de cada menu aplicado
	private DesjejumRel desjejum;
	private LancheManhaRel manha;
	private AlmocoRel almoco;
	private LancheTardeRel tarde;
	private JantaRel janta;
	private CeiaRel ceia;

	public RelatorioCardapioSemanal() {
		desjejum = new DesjejumRel();
		manha = new LancheManhaRel();
		almoco = new AlmocoRel();
		tarde = new LancheTardeRel();
		janta = new JantaRel();
		ceia = new CeiaRel();
	}

	private class DesjejumRel {

		private List<String> nome;

		public DesjejumRel() {
			nome = new ArrayList<>();
		}

		public void addNomePreparacao(String nome) {
			this.nome.add(nome);
		}

		public List<String> getNome() {
			return nome;
		}
	}

	private class LancheManhaRel {

		private List<String> nome;

		public LancheManhaRel() {
			nome = new ArrayList<>();
		}

		public void addNomePreparacao(String nome) {
			this.nome.add(nome);
		}

		public List<String> getNome() {
			return nome;
		}
	}

	private class AlmocoRel {

		private List<String> nome;

		public AlmocoRel() {
			nome = new ArrayList<>();
		}

		public void addNomePreparacao(String nome) {
			this.nome.add(nome);
		}

		public List<String> getNome() {
			return nome;
		}
	}

	private class LancheTardeRel {

		private List<String> nome;

		public LancheTardeRel() {
			nome = new ArrayList<>();
		}

		public void addNomePreparacao(String nome) {
			this.nome.add(nome);
		}

		public List<String> getNome() {
			return nome;
		}
	}

	private class JantaRel {

		private List<String> nome;

		public JantaRel() {
			nome = new ArrayList<>();
		}

		public void addNomePreparacao(String nome) {
			this.nome.add(nome);
		}

		public List<String> getNome() {
			return nome;
		}
	}

	private class CeiaRel {

		private List<String> nome;

		public CeiaRel() {
			nome = new ArrayList<>();
		}

		public void addNomePreparacao(String nome) {
			this.nome.add(nome);
		}

		public List<String> getNome() {
			return nome;
		}
	}

	public Date getDataMenu() {
		return dataMenu;
	}

	public void setDataMenu(Date dataMenu) {
		this.dataMenu = dataMenu;
	}

	public DesjejumRel getDesjejum() {
		return desjejum;
	}

	public void setDesjejum(String nome) {
		this.desjejum.addNomePreparacao(nome);
	}

	public LancheManhaRel getManha() {
		return manha;
	}

	public void setManha(String nome) {
		this.manha.addNomePreparacao(nome);
	}

	public AlmocoRel getAlmoco() {
		return almoco;
	}

	public void setAlmoco(String nome) {
		this.almoco.addNomePreparacao(nome);
	}

	public LancheTardeRel getTarde() {
		return tarde;
	}

	public void setTarde(String nome) {
		this.tarde.addNomePreparacao(nome);
	}

	public JantaRel getJanta() {
		return janta;
	}

	public void setJanta(String nome) {
		this.janta.addNomePreparacao(nome);
	}

	public CeiaRel getCeia() {
		return ceia;
	}

	public void setCeia(String nome) {
		this.ceia.addNomePreparacao(nome);
	}

}
