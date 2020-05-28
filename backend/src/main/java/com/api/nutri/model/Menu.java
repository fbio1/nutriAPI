package com.api.nutri.model;

import java.util.ArrayList;
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
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.api.core.model.GenericAbstractModel;

@Entity
@Table(name = "menu")
public class Menu extends GenericAbstractModel<Integer> {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	@NotEmpty(message = "Preencha o campo nome.")
	private String nome;

	@ManyToMany
	@JoinTable(name = "menu_preparacao_desjejum", joinColumns = {
			@JoinColumn(name = "FK_id_menu", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "FK_id_preparacao") })
	@Cascade({ CascadeType.REPLICATE })
	private List<Preparacao> desjejum = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "menu_preparacao_almoco", joinColumns = {
			@JoinColumn(name = "FK_id_menu", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "FK_id_preparacao") })
	@Cascade({ CascadeType.REPLICATE })
	private List<Preparacao> almoco = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "menu_preparacao_janta", joinColumns = {
			@JoinColumn(name = "FK_id_menu", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "FK_id_preparacao") })
	@Cascade({ CascadeType.REPLICATE })
	private List<Preparacao> janta = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "menu_preparacao_ceia", joinColumns = {
			@JoinColumn(name = "FK_id_menu", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "FK_id_preparacao") })
	@Cascade({ CascadeType.REPLICATE })
	private List<Preparacao> ceia = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "menu_preparacao_lanche_manha", joinColumns = {
			@JoinColumn(name = "FK_id_menu", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "FK_id_preparacao") })
	@Cascade({ CascadeType.REPLICATE })
	private List<Preparacao> lanche_manha = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "menu_preparacao_lanche_tarde", joinColumns = {
			@JoinColumn(name = "FK_id_menu", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "FK_id_preparacao") })
	@Cascade({ CascadeType.REPLICATE })
	private List<Preparacao> lanche_tarde = new ArrayList<>();

	public Menu() {
	}

	public Menu(String nome) {
		this.nome = nome;
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

	public List<Preparacao> getDesjejum() {
		return desjejum;
	}

	public void setDesjejum(List<Preparacao> desjejum) {
		this.desjejum = desjejum;
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

	public List<Preparacao> getLanche_manha() {
		return lanche_manha;
	}

	public void setLanche_manha(List<Preparacao> lanche_manha) {
		this.lanche_manha = lanche_manha;
	}

	public List<Preparacao> getLanche_tarde() {
		return lanche_tarde;
	}

	public void setLanche_tarde(List<Preparacao> lanche_tarde) {
		this.lanche_tarde = lanche_tarde;
	}
}