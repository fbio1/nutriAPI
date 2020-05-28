package com.api.nutri.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.api.core.model.GenericAbstractModel;

@Entity
@Table(name = "cardapio")
public class Cardapio extends GenericAbstractModel<Integer> {
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "nome", nullable = false)
    @NotEmpty(message = "Preencha o campo nome.")
    private String nome;
    
    @OneToOne
    @JoinTable(name = "cardapio_usuario_autor",
            joinColumns = {
                @JoinColumn(name = "FK_idCardapio",
                        referencedColumnName = "id")},
            inverseJoinColumns = {
                @JoinColumn(name = "FK_idUsuario")})
    private Usuario autor;
    
    @OneToOne
    @JoinTable(name = "cardapio_usuario_responsavel",
            joinColumns = {
                @JoinColumn(name = "FK_idCardapio",
                        referencedColumnName = "id")},
            inverseJoinColumns = {
                @JoinColumn(name = "FK_idUsuario")})
    private Usuario responsavel;

    @ManyToMany( cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, 
        org.hibernate.annotations.CascadeType.PERSIST, 
        org.hibernate.annotations.CascadeType.MERGE, 
        org.hibernate.annotations.CascadeType.DELETE
    })
    private List<Menu> menus = new ArrayList<>();

    public Cardapio() {
    }

    public Cardapio(String nome, Usuario autor, Usuario responsavel) {
        this.nome = nome;
        this.autor = autor;
        this.responsavel = responsavel;
    }

    public Cardapio(String nome, Usuario autor, Usuario responsavel, List<Menu> menus) {
        this.nome = nome;
        this.autor = autor;
        this.responsavel = responsavel;
        this.menus = menus;
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

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

}