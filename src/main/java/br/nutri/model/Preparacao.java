package br.nutri.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import br.nutri.model.enuns.AspectoGorduroso;
import br.nutri.model.enuns.CorPredominante;
import br.nutri.model.enuns.Enxofre;
import br.nutri.model.enuns.GrupoAlimentos;
import br.nutri.model.enuns.Sodio;
import br.nutri.model.enuns.TecnicasCoccao;
import br.nutri.model.enuns.TipoTextura;

@Entity
@Table(name = "preparacao")
public class Preparacao extends GenericAbstractModel<Integer> {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	@NotEmpty(message = "Preencha o campo nome.")
	private String nome;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	@NotNull(message = "Preencha o campo cor predominante.")
	private CorPredominante corPredominante;

	@Column(nullable = false)
	@NotNull(message = "Preencha o campo textura.")
	@Enumerated(EnumType.STRING)
	private TipoTextura textura;

	@Column(nullable = false)
	@NotNull(message = "Preencha o campo grupo de alimentos.")
	@Enumerated(EnumType.STRING)
	private GrupoAlimentos grupo;

	@Column(nullable = false)
	@NotNull(message = "Informe o tipo de preparação.")
	private boolean vegetariano;

	@Column(nullable = false, length = 501)
	@NotNull(message = "Preencha o campo modo de preparação.")
	private String modoDePreparo;

	@Column(nullable = false)
	@NotNull(message = "Informe se a preparação é rica em enxofre.")
	private Enxofre enxofre;

	@Column(nullable = false)
	@NotNull(message = "Preencha o campo técnica de cocção.")
	@Enumerated(EnumType.STRING)
	private TecnicasCoccao tecnicasCoccao;

	@Column(nullable = false)
	@NotNull(message = "Preencha o campo aspecto gorduroso.")
	@Enumerated(EnumType.STRING)
	private AspectoGorduroso aspectoGorduroso;

	@Column(nullable = false)
	@NotNull(message = "Preencha o campo sodio.")
	@Enumerated(EnumType.STRING)
	private Sodio sodio;

	@OneToOne
	@Fetch(FetchMode.JOIN)
	@Cascade({ CascadeType.SAVE_UPDATE, CascadeType.PERSIST, CascadeType.MERGE })
	@JoinColumn(name = "idSalaDePreparacao")
	private SalaPreparacao localPreparo;

	@ManyToMany(cascade = javax.persistence.CascadeType.REFRESH, fetch = FetchType.LAZY)
	@Fetch(FetchMode.SUBSELECT)
	@Cascade({ CascadeType.SAVE_UPDATE, CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "preparacao_insumopercapita", joinColumns = {
			@JoinColumn(name = "FK_idPreparacao", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "FK_idInsumoPerCapita") })
	private List<InsumoPerCapita> listaIngredientes = new ArrayList<>();

	public Preparacao() {
	}

	public Preparacao(String nome, CorPredominante corPredominante, TipoTextura textura, GrupoAlimentos grupo,
			boolean vegetariano, String modoDePreparo, Enxofre enxofre, TecnicasCoccao tecnicasCoccao,
			AspectoGorduroso aspectoGorduroso, Sodio sodio, SalaPreparacao localPreparo,
			List<InsumoPerCapita> listaIngredientes) {
		this.nome = nome;
		this.corPredominante = corPredominante;
		this.textura = textura;
		this.grupo = grupo;
		this.vegetariano = vegetariano;
		this.modoDePreparo = modoDePreparo;
		this.enxofre = enxofre;
		this.tecnicasCoccao = tecnicasCoccao;
		this.aspectoGorduroso = aspectoGorduroso;
		this.sodio = sodio;
		this.localPreparo = localPreparo;
		this.listaIngredientes = listaIngredientes;
	}

	public List<InsumoPerCapita> getListaIngredientes() {
		return listaIngredientes;
	}

	public void setListaIngredientes(List<InsumoPerCapita> listaIngredientes) {
		this.listaIngredientes = listaIngredientes;
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

	public Sodio getSodio() {
		return sodio;
	}

	public void setSodio(Sodio sodio) {
		this.sodio = sodio;
	}

	public CorPredominante getCorPredominante() {
		return corPredominante;
	}

	public void setCorPredominante(CorPredominante corPredominante) {
		this.corPredominante = corPredominante;
	}

	public TipoTextura getTextura() {
		return textura;
	}

	public void setTextura(TipoTextura textura) {
		this.textura = textura;
	}

	public GrupoAlimentos getGrupo() {
		return grupo;
	}

	public void setGrupo(GrupoAlimentos grupo) {
		this.grupo = grupo;
	}

	public boolean isVegetariano() {
		return vegetariano;
	}

	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}

	public String getModoDePreparo() {
		return modoDePreparo;
	}

	public void setModoDePreparo(String modoDePreparo) {
		this.modoDePreparo = modoDePreparo;
	}

	public SalaPreparacao getLocalPreparo() {
		return localPreparo;
	}

	public void setLocalPreparo(SalaPreparacao localPreparo) {
		this.localPreparo = localPreparo;
	}

	public Enxofre getEnxofre() {
		return enxofre;
	}

	public void setEnxofre(Enxofre enxofre) {
		this.enxofre = enxofre;
	}

	public TecnicasCoccao getTecnicasCoccao() {
		return tecnicasCoccao;
	}

	public void setTecnicasCoccao(TecnicasCoccao tecnicasCoccao) {
		this.tecnicasCoccao = tecnicasCoccao;
	}

	public AspectoGorduroso getAspectoGorduroso() {
		return aspectoGorduroso;
	}

	public void setAspectoGorduroso(AspectoGorduroso aspectoGorduroso) {
		this.aspectoGorduroso = aspectoGorduroso;
	}
}
