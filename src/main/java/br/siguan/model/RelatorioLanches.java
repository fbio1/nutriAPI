package br.siguan.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.siguan.model.enuns.UnidadeBase;

public class RelatorioLanches {

	private List<PreparacaoLanches> preparacoes;
	private Date data;

	public RelatorioLanches() {
		preparacoes = new ArrayList<>();
	}

	public class PreparacaoLanches {

		private String nome;
		private List<InsumoLanches> insumos = new ArrayList<>();;

		public PreparacaoLanches(String nome) {
			this.nome = nome;
		}

		@SuppressWarnings("unused")
		private PreparacaoLanches() {

		}

		public class InsumoLanches {

			private String nome;
			private double quantidade;
			private UnidadeBase unidade;

			public InsumoLanches(String nome, double quantidade, UnidadeBase unidade) {
				this.nome = nome;
				this.quantidade = quantidade;
				this.unidade = unidade;
			}

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public double getQuantidade() {
				return quantidade;
			}

			public void setQuantidade(double quantidade) {
				this.quantidade = quantidade;
			}

			public UnidadeBase getUnidade() {
				return unidade;
			}

			public void setUnidade(UnidadeBase unidade) {
				this.unidade = unidade;
			}

		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public List<InsumoLanches> getInsumos() {
			return insumos;
		}

		public void setInsumos(String nome, double quantidade, UnidadeBase unidade) {
			this.insumos.add(new InsumoLanches(nome, quantidade, unidade));
		}

	}

	public List<PreparacaoLanches> getPreparacoes() {
		return preparacoes;
	}

	public void setPreparacoes(String nome) {
		this.preparacoes.add(new PreparacaoLanches(nome));
	}

	public int addPreparacao(String nome) {
		PreparacaoLanches p = new PreparacaoLanches(nome);
		this.preparacoes.add(p);

		return preparacoes.indexOf(p);
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
