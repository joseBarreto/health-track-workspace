package br.com.fiap.healthtrack.bean;

import java.io.Serializable;
import java.util.Calendar;

public class HistoricoPeso implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id_historico_peso;
	private int id_usuario;
	private Calendar dt_cadastro;
	private int peso;
	private String ob_observacao;

	public HistoricoPeso(int id_historico_peso, int id_usuario, Calendar dt_cadastro, int peso, String ob_observacao) {
		super();
		this.id_historico_peso = id_historico_peso;
		this.id_usuario = id_usuario;
		this.dt_cadastro = dt_cadastro;
		this.peso = peso;
		this.ob_observacao = ob_observacao;
	}

	public int getId_historico_peso() {
		return id_historico_peso;
	}

	public void setId_historico_peso(int id_historico_peso) {
		this.id_historico_peso = id_historico_peso;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Calendar getDt_cadastro() {
		return dt_cadastro;
	}

	public void setDt_cadastro(Calendar dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getOb_observacao() {
		return ob_observacao;
	}

	public void setOb_observacao(String ob_observacao) {
		this.ob_observacao = ob_observacao;
	}

}
