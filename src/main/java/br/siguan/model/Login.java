package br.siguan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;

@Entity(name = "login")
@Table
public class Login extends AbstractModel<Integer> {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "login", unique = true, nullable = false)
	@NotEmpty(message = "Por favor, insira seu login!")
	private String login;

	@Column(name = "senha", nullable = false)
	@NotEmpty(message = "Por favor, insira sua senha!")
	@Size(min = 8, message = "A senha deve conter no mínimo 8 dígitos")
	private String senha;

//	@Column(name = "pergunta", nullable = false)
//	@Enumerated(EnumType.STRING)
//	@NotNull(message = "Por favor, informe a pergunta secreta!")
//	private PerguntaSecreta pergunta;
//
//	@Column(name = "resposta", nullable = false)
//	@NotEmpty(message = "Por favor, insira a resposta da pergunta secreta!")
//	private String resposta;
//
//	@Column
//	private String token;
//
//	@Column
//	private int alteracoes;

	@OneToOne
	@Cascade({ org.hibernate.annotations.CascadeType.ALL })
	private Usuario usuario;
	
//	public Login(String login, String senha, PerguntaSecreta pergunta, String resposta, Usuario usuario) {
//		this.login = login;
//		this.senha = senha;
//		this.pergunta = pergunta;
//		this.resposta = resposta;
//		this.usuario = usuario;
//	}

	public Login() {
	}

//	public void login() {
//		setToken(Token.criarToken(id, usuario.getTipo()));
//	}
//
//	public void logout() {
//		setToken(null);
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

//	public PerguntaSecreta getPergunta() {
//		return pergunta;
//	}
//
//	public void setPergunta(PerguntaSecreta pergunta) {
//		this.pergunta = pergunta;
//	}
//
//	public String getResposta() {
//		return resposta;
//	}
//
//	public void setResposta(String resposta) {
//		this.resposta = resposta;
//	}
//
//	public String getToken() {
//		return token;
//	}
//
//	public void setToken(String token) {
//		this.token = token;
//	}
//
//	public int getAlteracoes() {
//		return alteracoes;
//	}
//
//	public void setAlteracoes(int alteracoes) {
//		this.alteracoes = alteracoes;
//	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}