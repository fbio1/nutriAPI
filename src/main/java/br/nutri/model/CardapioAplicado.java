package br.nutri.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "cardapio_aplicado")
public class CardapioAplicado extends GenericAbstractModel<Integer> {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nome", nullable = false)
	@NotEmpty(message = "Preencha o campo nome.")
	private String nome;

	@OneToMany
	@JoinTable(name = "cardapio_aplicado_menu_aplicado", joinColumns = {
			@JoinColumn(name = "FK_cardapioAplicado", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "FK_menuAplicado") })
	@Cascade({ CascadeType.SAVE_UPDATE, CascadeType.PERSIST, CascadeType.REFRESH })
	private List<MenuAplicado> menus = new ArrayList<>();

	@OneToOne
	@JoinColumn(name = "idUsuario")
	private Usuario responsavel = new Usuario();

	public CardapioAplicado(String nome, List<MenuAplicado> menus, Usuario responsavel) {
		this.nome = nome;
		this.menus = menus;
		this.responsavel = responsavel;
	}

	public CardapioAplicado() {
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

	public List<MenuAplicado> getMenus() {
		return menus;
	}

	public void setMenus(List<MenuAplicado> menus) {
		this.menus = menus;
	}

	public Usuario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 59 * hash + Objects.hashCode(this.id);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final CardapioAplicado other = (CardapioAplicado) obj;
		if (!Objects.equals(this.id, other.id)) {
			return false;
		}
		return true;
	}

}