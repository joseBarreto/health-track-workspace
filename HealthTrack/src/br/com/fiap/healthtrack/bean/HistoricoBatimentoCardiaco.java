package br.com.fiap.healthtrack.bean;

import java.io.Serializable;

public class HistoricoBatimentoCardiaco implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id_hist_batimento_cardiaco;
	private int id_usuario;
	private boolean irregular;
	private int valor;
	private String ob_observacao;

	public HistoricoBatimentoCardiaco(int id_hist_batimento_cardiaco, int id_usuario, boolean irregular, int valor, String ob_observacao) {
		super();
		this.id_hist_batimento_cardiaco = id_hist_batimento_cardiaco;
		this.id_usuario = id_usuario;
		this.valor = valor;
		this.irregular = irregular;
		this.ob_observacao = ob_observacao;
	}

	public int getId_hist_batimento_cardiaco() {
		return id_hist_batimento_cardiaco;
	}

	public void setId_hist_batimento_cardiaco(int id_hist_batimento_cardiaco) {
		this.id_hist_batimento_cardiaco = id_hist_batimento_cardiaco;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getOb_observacao() {
		return ob_observacao;
	}

	public void setOb_observacao(String ob_observacao) {
		this.ob_observacao = ob_observacao;
	}

	public boolean getIrregular() {
		return irregular;
	}

	public void setIrregular(boolean irregular) {
		this.irregular = irregular;
	}

}
