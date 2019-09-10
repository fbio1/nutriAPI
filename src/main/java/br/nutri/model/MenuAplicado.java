package br.nutri.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "menu_aplicado")
public class MenuAplicado extends AbstractModel<Integer> {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToMany
	@JoinTable(name = "menu_aplicado_almoco", joinColumns = {
			@JoinColumn(name = "FK_idMenuAplicado", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "FK_idPreparacao") })
	@Cascade({ org.hibernate.annotations.CascadeType.REPLICATE })
	private List<Preparacao> almoco = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "menu_aplicado_janta", joinColumns = {
			@JoinColumn(name = "FK_idMenuAplicado", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "FK_idPreparacao") })
	@Cascade({ org.hibernate.annotations.CascadeType.REPLICATE })
	private List<Preparacao> janta = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "menu_aplicado_ceia", joinColumns = {
			@JoinColumn(name = "FK_idMenuAplicado", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "FK_idPreparacao") })
	@Cascade({ org.hibernate.annotations.CascadeType.REPLICATE })
	private List<Preparacao> ceia = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "menu_aplicado_lanche_tarde", joinColumns = {
			@JoinColumn(name = "FK_idMenuAplicado", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "FK_idPreparacao") })
	@Cascade({ org.hibernate.annotations.CascadeType.REPLICATE })
	private List<Preparacao> lanche_tarde = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "menu_aplicado_lanche_manha", joinColumns = {
			@JoinColumn(name = "FK_idMenuAplicado", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "FK_idPreparacao") })
	@Cascade({ org.hibernate.annotations.CascadeType.REPLICATE })
	private List<Preparacao> lanche_manha = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "menu_aplicado_desjejum", joinColumns = {
			@JoinColumn(name = "FK_idMenuAplicado", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "FK_idPreparacao") })
	@Cascade({ org.hibernate.annotations.CascadeType.REPLICATE })
	private List<Preparacao> desjejum = new ArrayList<>();

	@Column
	@NotNull(message = "Preencha o campo data.")
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Brazil/East")
	private Date dia;

	@Column
	@NotNull(message = "Informe a previsão de quantidade de comensais no desjejum.")
	private int previsaoNumDesjejum;

	@Column
	@NotNull(message = "Informe a previsão de quantidade de comensais no lanche da manhã.")
	private int previsaoNumLancheManha;

	@Column
	@NotNull(message = "Informe a previsão de quantidade de comensais no almoço.")
	private int previsaoNumAlmoco;

	@Column
	@NotNull(message = "Informe a previsão de quantidade de comensais no lanche da tarde.")
	private int previsaoNumLancheTarde;

	@Column
	@NotNull(message = "Informe a previsão de quantidade de comensais na ceia.")
	private int previsaoNumCeia;

	@Column
	@NotNull(message = "Informe a previsão de quantidade de comensais na janta.")
	private int previsaoNumJanta;

	@Column(nullable = true)
	private boolean checked = false;

	public MenuAplicado() {
	}

	public MenuAplicado(Date dia, int previsaoNumDesjejum, int previsaoNumLancheManha, int previsaoNumAlmoco,
			int previsaoNumLancheTarde, int previsaoNumCeia, int previsaoNumJanta) {
		this.dia = dia;
		this.previsaoNumDesjejum = previsaoNumDesjejum;
		this.previsaoNumLancheManha = previsaoNumLancheManha;
		this.previsaoNumAlmoco = previsaoNumAlmoco;
		this.previsaoNumLancheTarde = previsaoNumLancheTarde;
		this.previsaoNumCeia = previsaoNumCeia;
		this.previsaoNumJanta = previsaoNumJanta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Preparacao> getAlmoco() {
		return almoco;
	}

	public void setAlmoco(List<Preparacao> almoco) {
		this.almoco = almoco;
	}

	public List<Preparacao> getJanta() {
		return janta;
	}

	public void setJanta(List<Preparacao> janta) {
		this.janta = janta;
	}

	public List<Preparacao> getCeia() {
		return ceia;
	}

	public void setCeia(List<Preparacao> ceia) {
		this.ceia = ceia;
	}

	public List<Preparacao> getLanche_tarde() {
		return lanche_tarde;
	}

	public void setLanche_tarde(List<Preparacao> lanche_tarde) {
		this.lanche_tarde = lanche_tarde;
	}

	public List<Preparacao> getLanche_manha() {
		return lanche_manha;
	}

	public void setLanche_manha(List<Preparacao> lanche_manha) {
		this.lanche_manha = lanche_manha;
	}

	public List<Preparacao> getDesjejum() {
		return desjejum;
	}

	public void setDesjejum(List<Preparacao> desjejum) {
		this.desjejum = desjejum;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public int getPrevisaoNumDesjejum() {
		return previsaoNumDesjejum;
	}

	public void setPrevisaoNumDesjejum(int previsaoNumDesjejum) {
		this.previsaoNumDesjejum = previsaoNumDesjejum;
	}

	public int getPrevisaoNumLancheManha() {
		return previsaoNumLancheManha;
	}

	public void setPrevisaoNumLancheManha(int previsaoNumLancheManha) {
		this.previsaoNumLancheManha = previsaoNumLancheManha;
	}

	public int getPrevisaoNumAlmoco() {
		return previsaoNumAlmoco;
	}

	public void setPrevisaoNumAlmoco(int previsaoNumAlmoco) {
		this.previsaoNumAlmoco = previsaoNumAlmoco;
	}

	public int getPrevisaoNumLancheTarde() {
		return previsaoNumLancheTarde;
	}

	public void setPrevisaoNumLancheTarde(int previsaoNumLancheTarde) {
		this.previsaoNumLancheTarde = previsaoNumLancheTarde;
	}

	public int getPrevisaoNumCeia() {
		return previsaoNumCeia;
	}

	public void setPrevisaoNumCeia(int previsaoNumCeia) {
		this.previsaoNumCeia = previsaoNumCeia;
	}

	public int getPrevisaoNumJanta() {
		return previsaoNumJanta;
	}

	public void setPrevisaoNumJanta(int previsaoNumJanta) {
		this.previsaoNumJanta = previsaoNumJanta;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}
}
