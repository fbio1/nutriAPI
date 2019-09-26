package br.nutri.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "insumo_per_capta")
public class InsumoPerCapita extends GenericAbstractModel<Integer> {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne(optional = false)
	@Cascade({ CascadeType.SAVE_UPDATE, CascadeType.PERSIST, CascadeType.MERGE })
	@NotNull(message = "O campo insumo não pode ser nulo")
	private Insumo ingrediente;

	@Column(name = "nome", nullable = false)
	@NotNull(message = "Por favor, prencha o nome do insumo!")
	private String nome;

	@Column(name = "pesoLimpo", nullable = false)
	@NotNull(message = "Por favor, prencha o campo peso limpo!")
	private double pesoLimpo;

	@Column(name = "pesoBruto", nullable = false)
	@NotNull(message = "Por favor, preencha o campo peso bruto!")
	private double pesoBruto;

	@Column(name = "fatorDeCorrecao", nullable = false)
	@NotNull(message = "Por favor, preencha o campo fator de correção!")
	private double fatorDeCorrecao;

	@Column(name = "condimento", nullable = false)
	@NotNull(message = "Por favor, preencha o campo condimento!")
	private boolean condimento;

	@Column(name = "observacao", nullable = true, length = 500) // pode ser nulo
	private String observacao;

	@ManyToOne // (optional = false)
	private TipoCorte corte;

	public InsumoPerCapita() {
	}

	public InsumoPerCapita(Insumo ingrediente, double pesoLimpo, double pesoBruto, double fatorDeCorrecao,
			TipoCorte corte, boolean condimento, String observacao, String nome) {
		this.ingrediente = ingrediente;
		this.pesoLimpo = pesoLimpo;
		this.pesoBruto = pesoBruto;
		this.fatorDeCorrecao = fatorDeCorrecao;
		this.corte = corte;
		this.condimento = condimento;
		this.observacao = observacao;
		this.nome = nome;
	}

	public InsumoPerCapita(Insumo ingrediente, double pesoLimpo, double pesoBruto, double fatorDeCorrecao,
			boolean condimento, String observacao) {
		this.ingrediente = ingrediente;
		this.pesoLimpo = pesoLimpo;
		this.pesoBruto = pesoBruto;
		this.fatorDeCorrecao = fatorDeCorrecao;
		this.condimento = condimento;
		this.observacao = observacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Insumo getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Insumo ingrediente) {
		this.ingrediente = ingrediente;
	}

	public double getPesoLimpo() {
		return pesoLimpo;
	}

	public void setPesoLimpo(double pesoLimpo) {
		this.pesoLimpo = pesoLimpo;
	}

	public double getPesoBruto() {
		return pesoBruto;
	}

	public void setPesoBruto(double pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	public double getFatorDeCorrecao() {
		return fatorDeCorrecao;
	}

	public void setFatorDeCorrecao(double fatorDeCorrecao) {
		this.fatorDeCorrecao = fatorDeCorrecao;
	}

	public TipoCorte getCorte() {
		return corte;
	}

	public void setCorte(TipoCorte corte) {
		this.corte = corte;
	}

	public boolean isCondimento() {
		return condimento;
	}

	public void setCondimento(boolean condimento) {
		this.condimento = condimento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
