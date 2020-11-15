package br.com.fiap.healthtrack.bean;

import java.io.Serializable;
import java.util.Calendar;

import br.com.fiap.healthtrack.util.CriptografiaUtils;

public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id_usuario;
	private String nm_nome;
	private String sobrenome;
	private char sexo;
	private Calendar dt_nascimento;
	private Calendar dt_cadastro;	
	private String email;
	private String senha;
	private Calendar dt_ultimo_acesso;
	
	public Usuario() {
		super();
	}

	public Usuario(int id_usuario, String nm_nome, String sobrenome, char sexo, Calendar dt_nascimento, Calendar dt_cadastro,
			String email, Calendar dt_ultimo_acesso) {
		super();
		this.id_usuario = id_usuario;
		this.nm_nome = nm_nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.dt_nascimento = dt_nascimento;
		this.dt_cadastro = dt_cadastro;		
		this.email = email;		
		this.dt_ultimo_acesso = dt_ultimo_acesso;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNm_nome() {
		return nm_nome;
	}

	public void setNm_nome(String nm_nome) {
		this.nm_nome = nm_nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Calendar getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Calendar dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public Calendar getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(Calendar dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}

	public Calendar getDt_ultimo_acesso() {
		return dt_ultimo_acesso;
	}

	public void setDt_ultimo_acesso(Calendar dt_ultimo_acesso) {
		this.dt_ultimo_acesso = dt_ultimo_acesso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		try {
			this.senha = CriptografiaUtils.criptografar(senha);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
