package br.siguan.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.siguan.model.enuns.TipoUsuario;

@Entity
@Table(name = "Usuario")
public class Usuario extends AbstractModel<Integer> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "idUsuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", nullable = false)
    @NotEmpty(message = "Por favor, insira seu nome!")
    private String nome;

    @Column(nullable = true) // false indica que não pode ser nulo
    @NotEmpty(message = "Por favor, insira uma imagem!")
    private String imagem;

    @Column(name = "tipo", nullable = false)
    @Enumerated(EnumType.STRING)
    @NotNull(message = "Por favor, informe o tipo de usuário!")
    private TipoUsuario tipo;

    @Column(name = "email", nullable = false)
    @Email(message = "O campo email é inválido.")
    @NotNull(message = "Por favor, informe o email do usuário!")
    String email;

    public Usuario() {

    }

    public Usuario( String nome, String imagem, TipoUsuario tipo, String email) {
        this.nome = nome;
        this.imagem = imagem;
        this.tipo = tipo;
        this.email = email;
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

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
