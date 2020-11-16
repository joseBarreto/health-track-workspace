package br.com.fiap.healthtrack.factory;

import br.com.fiap.healthtrack.dao.HistoricoBatimentoCardiacoDAO;
import br.com.fiap.healthtrack.dao.ProdutoDAO;
import br.com.fiap.healthtrack.dao.UsuarioDAO;
import br.com.fiap.healthtrack.dao.impl.OracleHistoricoBatimentoCardiacoDAO;
import br.com.fiap.healthtrack.dao.impl.OracleProdutoDAO;
import br.com.fiap.healthtrack.dao.impl.OracleUsuarioDAO;

public class DAOFactory {
	public static ProdutoDAO getProdutoDAO() {
		return new OracleProdutoDAO();
	}
	
	public static UsuarioDAO getUsuarioDAO() {
		return new OracleUsuarioDAO();
	}

	public static HistoricoBatimentoCardiacoDAO getHistoricoBatimentoCardiacoDAO() {
		return new OracleHistoricoBatimentoCardiacoDAO();
	}
}
