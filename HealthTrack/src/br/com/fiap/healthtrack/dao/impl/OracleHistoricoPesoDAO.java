package br.com.fiap.healthtrack.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.Date;

import br.com.fiap.healthtrack.bean.HistoricoPeso;
import br.com.fiap.healthtrack.dao.HistoricoPesoDAO;
import br.com.fiap.healthtrack.exception.DBException;
import br.com.fiap.healthtrack.singleton.ConnectionManager;

public class OracleHistoricoPesoDAO implements HistoricoPesoDAO {

	private Connection conexao;
	
	@Override
	public void cadastrar(HistoricoPeso peso) throws DBException {
		PreparedStatement stmt = null;

		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "INSERT INTO t_htr_hist_batimento_cardiaco (ID_HISTORICO_PESO, ID_USUARIO, DT_CADASTRO, PESO, OB_OBSERVACAO) VALUES (SQ_T_HTR_HISTORICO_PESO.NEXTVAL, ?, ?, ?, ?)";
			java.sql.Date data = new java.sql.Date(peso.getDt_cadastro().getTimeInMillis());
			
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, peso.getId_usuario());			
			stmt.setDate(2, data);			
			stmt.setInt(3, peso.getPeso());
			stmt.setString(4, peso.getOb_observacao());	
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Erro ao cadastrar.");
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void atualizar(HistoricoPeso peso) throws DBException {
		PreparedStatement stmt = null;

		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "UPDATE t_htr_hist_batimento_cardiaco SET PESO = ?, OB_OBSERVACAO = ? where ID_HISTORICO_PESO = ?";
			
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, peso.getPeso());
			stmt.setString(2, peso.getOb_observacao());	
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Erro ao atualizar.");
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void remover(int codigo) throws DBException {
		PreparedStatement stmt = null;

		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "DELETE FROM t_htr_hist_batimento_cardiaco WHERE ID_HISTORICO_PESO = ?";
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, codigo);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Erro ao remover.");
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public HistoricoPeso buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HistoricoPeso> listar(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

}