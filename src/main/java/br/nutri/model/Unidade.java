package br.nutri.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.nutri.model.enuns.UnidadeBase;

@Entity
@Table(name = "unidade")
public class Unidade extends AbstractModel<Integer> {
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", nullable = false)
    @NotEmpty(message = "Preencha o campo nome.")
    private String nome;

    @Column(name = "tipo", nullable = false)
    @Enumerated(EnumType.STRING)
    @NotNull(message = "Preencha o campo tipo.")
    private UnidadeBase tipo;

    @Column(name = "multiplicador", nullable = false)
    @NotNull(message = "O campo multiplicador não pode ser vazio.")
    private Double multiplicador;

    public Unidade() {
    }

    public Unidade(String nome, UnidadeBase tipo, Double multiplicador) {
        this.nome = nome;
        this.tipo = tipo;
        this.multiplicador = multiplicador;
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

    public UnidadeBase getTipo() {
        return tipo;
    }

    public void setTipo(UnidadeBase tipo) {
        this.tipo = tipo;
    }

    public Double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(Double multiplicador) {
        this.multiplicador = multiplicador;
    }
}
