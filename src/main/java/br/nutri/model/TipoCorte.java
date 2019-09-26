package br.nutri.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "tipo_corte")
public class TipoCorte implements Model {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nome", nullable = false)
	@NotEmpty(message = "Preencha o campo nome.")
	private String nome;

	@Column(name = "descricao", nullable = false, length = 500)
	@NotEmpty(message = "A descrição não pode ser vazia.")
	private String descricao;

	@Column(name = "observacao", nullable = true, length = 500) // pode ser nulo
	private String observacao;

	@Column(name = "active")
	private Boolean active;

	public TipoCorte() {
	}

	public TipoCorte(String nome, String descricao, String observacao) {
		this.nome = nome;
		this.descricao = descricao;
		this.observacao = observacao;
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

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Boolean getActive() {
		return active;
	}

	@Override
	public void setActive(Boolean active) {
		this.active = active;
	}
}