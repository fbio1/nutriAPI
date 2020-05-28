package com.api.nutri.model;

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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;

import com.api.core.model.GenericAbstractModel;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "prescricao")
public class Prescricao extends GenericAbstractModel<Integer> {
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private CardapioAplicado menu;
    
    @Column
    @NotNull(message = "O campo data não pode ser vazio")
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Brazil/East")
    private Date dia;

    @OneToOne
    @JoinColumn( name = "idUsuario")
    private Usuario responsavel;

    @OneToMany
    @JoinTable(name = "prescricao_itensDesjejum",
            joinColumns = {
                @JoinColumn(name = "FK_Prescricao",
                        referencedColumnName = "id")},
            inverseJoinColumns = {
                @JoinColumn(name = "FK_ItemEstoque")})
    @Cascade({org.hibernate.annotations.CascadeType.REPLICATE})
    private List<ItemEstoque> itensDesjejum = new ArrayList<>();

    @OneToMany
    @JoinTable(name = "prescricao_itensLancheManha",
            joinColumns = {
                @JoinColumn(name = "FK_Prescricao",
                        referencedColumnName = "id")},
            inverseJoinColumns = {
                @JoinColumn(name = "FK_ItemEstoque")})
    @Cascade({org.hibernate.annotations.CascadeType.REPLICATE})
    private List<ItemEstoque> itensLancheManha = new ArrayList<>();

    @OneToMany
    @JoinTable(name = "prescricao_itensAlmoco",
            joinColumns = {
                @JoinColumn(name = "FK_Prescricao",
                        referencedColumnName = "id")},
            inverseJoinColumns = {
                @JoinColumn(name = "FK_ItemEstoque")})
    @Cascade({org.hibernate.annotations.CascadeType.REPLICATE})
    private List<ItemEstoque> itensAlmoco = new ArrayList<>();

    @OneToMany
    @JoinTable(name = "prescricao_itensLancheTarde",
            joinColumns = {
                @JoinColumn(name = "FK_Prescricao",
                        referencedColumnName = "id")},
            inverseJoinColumns = {
                @JoinColumn(name = "FK_ItemEstoque")})
    @Cascade({org.hibernate.annotations.CascadeType.REPLICATE})
    private List<ItemEstoque> itensLancheTarde = new ArrayList<>();

    @OneToMany
    @JoinTable(name = "prescricao_itensJanta",
            joinColumns = {
                @JoinColumn(name = "FK_Prescricao",
                        referencedColumnName = "id")},
            inverseJoinColumns = {
                @JoinColumn(name = "FK_ItemEstoque")})
    @Cascade({org.hibernate.annotations.CascadeType.REPLICATE})
    private List<ItemEstoque> itensJanta = new ArrayList<>();

    @OneToMany
    @JoinTable(name = "prescricao_itensCeia",
            joinColumns = {
                @JoinColumn(name = "FK_Prescricao",
                        referencedColumnName = "id")},
            inverseJoinColumns = {
                @JoinColumn(name = "FK_ItemEstoque")})
    @Cascade({org.hibernate.annotations.CascadeType.REPLICATE})
    private List<ItemEstoque> itensCeia = new ArrayList<>();
    
    public Prescricao() {
    }

    public Prescricao(CardapioAplicado menu, Date dia, Usuario responsavel) {
        this.menu = menu;
        this.dia = dia;
        this.responsavel = responsavel;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CardapioAplicado getMenu() {
        return menu;
    }

    public void setMenu(CardapioAplicado menu) {
        this.menu = menu;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public List<ItemEstoque> getItensDesjejum() {
        return itensDesjejum;
    }

    public void setItensDesjejum(List<ItemEstoque> itensDesjejum) {
        this.itensDesjejum = itensDesjejum;
    }

    public List<ItemEstoque> getItensLancheManha() {
        return itensLancheManha;
    }

    public void setItensLancheManha(List<ItemEstoque> itensLancheManha) {
        this.itensLancheManha = itensLancheManha;
    }

    public List<ItemEstoque> getItensAlmoco() {
        return itensAlmoco;
    }

    public void setItensAlmoco(List<ItemEstoque> itensAlmoco) {
        this.itensAlmoco = itensAlmoco;
    }

    public List<ItemEstoque> getItensLancheTarde() {
        return itensLancheTarde;
    }

    public void setItensLancheTarde(List<ItemEstoque> itensLancheTarde) {
        this.itensLancheTarde = itensLancheTarde;
    }

    public List<ItemEstoque> getItensJanta() {
        return itensJanta;
    }

    public void setItensJanta(List<ItemEstoque> itensJanta) {
        this.itensJanta = itensJanta;
    }

    public List<ItemEstoque> getItensCeia() {
        return itensCeia;
    }

    public void setItensCeia(List<ItemEstoque> itensCeia) {
        this.itensCeia = itensCeia;
    }
}