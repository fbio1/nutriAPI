package br.siguan.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.siguan.model.enuns.TipoInsumo;
import br.siguan.model.enuns.UnidadeBase;

@Entity
@Table(name = "insumo")
public class Insumo extends AbstractModel<Integer> {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nome", nullable = false)
	@NotEmpty(message = "Preencha o campo nome.")
	private String nome;

	@Column(name = "descricao", nullable = false, length = 500)
	@NotEmpty(message = "Preencha o campo descrição.")
	private String descricao;

	@OneToOne(cascade = CascadeType.ALL, optional = true)
	private AnaliseQuimica analise;

	@Column(name = "tipo", nullable = false)
	@Enumerated(EnumType.STRING)
	@NotNull(message = "Preencha o campo tipo.")
	private TipoInsumo tipo;

	@Column(name = "unidadeBase", nullable = false)
	@Enumerated(EnumType.STRING)
	@NotNull(message = "Preencha o campo unidade base.")
	private UnidadeBase unidadeBase;

	public Insumo() {
	}

	public Insumo(String nome, String descricao, AnaliseQuimica analise, TipoInsumo tipo, UnidadeBase unidadeBase) {
		this.nome = nome;
		this.descricao = descricao;
		this.analise = analise;
		this.tipo = tipo;
		this.unidadeBase = unidadeBase;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public AnaliseQuimica getAnalise() {
		return analise;
	}

	public void setAnalise(AnaliseQuimica analise) {
		this.analise = analise;
	}

	public TipoInsumo getTipo() {
		return tipo;
	}

	public void setTipo(TipoInsumo tipo) {
		this.tipo = tipo;
	}

	public UnidadeBase getUnidadeBase() {
		return unidadeBase;
	}

	public void setUnidadeBase(UnidadeBase unidadeBase) {
		this.unidadeBase = unidadeBase;
	}
}
