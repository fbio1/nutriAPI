package br.siguan.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name = "itensEstoques")
@Table
public class ItemEstoque extends AbstractModel<Integer> {
	@Id
    @Column(name = "idItemEstoque")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "validade")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Brazil/East")
    private Date validade;
    
    @OneToOne
    @JoinColumn(name = "idInsumo")
    private Insumo item;

    @OneToOne
    @JoinColumn(name = "idUnidade")
    private Unidade porcao;

    @Column(name = "quantidade", nullable = false)
    @NotNull(message = "Preencha o campo quantidade.")
    private int quantidade;
    
    @Column(nullable = false)
    private boolean entrada;
    
    @Column
    @NotNull(message = "O campo data não pode ser nulo.")
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="Brazil/East")
    private Date data;
    
    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario responsavel;
    
    @Column(nullable = true)
//    @NotEmpty(message = "O campo observação não pode ser vazio.")
    private String observacao;

    public ItemEstoque() {
    }

    public ItemEstoque(Insumo item, Date validade, Unidade porcao, int quantidade, boolean entrada, Date data, Usuario responsavel, String observacao) {
        this.item = item;
        this.validade = validade;
        this.porcao = porcao;
        this.quantidade = quantidade;
        this.entrada = entrada;
        this.data = data;
        this.responsavel = responsavel;
        this.observacao = observacao;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public boolean isEntrada() {
        return entrada;
    }

    public void setEntrada(boolean entrada) {
        this.entrada = entrada;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Insumo getItem() {
        return item;
    }

    public void setItem(Insumo item) {
        this.item = item;
    }

    public Unidade getPorcao() {
        return porcao;
    }

    public void setPorcao(Unidade porcao) {
        this.porcao = porcao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }    
}
