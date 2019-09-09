package br.siguan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "SalaDePreparacao")
public class SalaDePreparacao extends AbstractModel<Integer> {
	@Id
	@Column(name = "idSalaDePreparacao")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nome", nullable = false)
	@NotEmpty(message = "Preencha o campo nome.")
	private String nome;

	@Column(name = "descricao", nullable = false, length = 500)
	@NotEmpty(message = "Insira uma descrição.")
	private String descricao;

	@Column(name = "numFuncionarios", nullable = false)
	@NotNull(message = "Informe a quantidade de funcionários.")
	private int numFuncionarios;

	public SalaDePreparacao() {
	}

	public SalaDePreparacao(String nome, String descricao, int numFuncionarios) {
		this.nome = nome;
		this.descricao = descricao;
		this.numFuncionarios = numFuncionarios;
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

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
}