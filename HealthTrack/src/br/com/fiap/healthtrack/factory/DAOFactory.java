package br.com.fiap.healthtrack.factory;

import br.com.fiap.healthtrack.dao.UsuarioDAO;
import br.com.fiap.healthtrack.dao.impl.OracleUsuarioDAO;

import br.com.fiap.healthtrack.dao.HistoricoBatimentoCardiacoDAO;
import br.com.fiap.healthtrack.dao.impl.OracleHistoricoBatimentoCardiacoDAO;

import br.com.fiap.healthtrack.dao.impl.OracleHistoricoPesoDAO;
import br.com.fiap.healthtrack.dao.HistoricoPesoDAO;

public class DAOFactory {

	
	public static UsuarioDAO getUsuarioDAO() {
		return new OracleUsuarioDAO();
	}

	public static HistoricoBatimentoCardiacoDAO getHistoricoBatimentoCardiacoDAO() {
		return new OracleHistoricoBatimentoCardiacoDAO();
	}
	
	public static HistoricoPesoDAO getHistoricoPesoDAO() {
		return new OracleHistoricoPesoDAO();
	}
}
