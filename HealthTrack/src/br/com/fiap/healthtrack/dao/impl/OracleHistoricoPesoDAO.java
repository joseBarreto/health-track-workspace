package br.com.fiap.healthtrack.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
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
			String sql = "INSERT INTO T_HTR_HISTORICO_PESO (ID_HISTORICO_PESO, ID_USUARIO, DT_CADASTRO, PESO, OB_OBSERVACAO) VALUES (SQ_T_HTR_HISTORICO_PESO.NEXTVAL, ?, ?, ?, ?)";
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
			String sql = "UPDATE T_HTR_HISTORICO_PESO SET PESO = ?, OB_OBSERVACAO = ?, DT_CADASTRO = ? where ID_HISTORICO_PESO = ?";
			java.sql.Date dt_cadastro = new java.sql.Date(peso.getDt_cadastro().getTimeInMillis());
			
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, peso.getPeso());
			stmt.setString(2, peso.getOb_observacao());	
			stmt.setDate(3, dt_cadastro);
			stmt.setInt(4, peso.getId_historico_peso());
			
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
			String sql = "DELETE FROM T_HTR_HISTORICO_PESO WHERE ID_HISTORICO_PESO = ?";
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
		HistoricoPeso peso = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT * FROM T_HTR_HISTORICO_PESO WHERE ID_HISTORICO_PESO = ?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				int codigo = rs.getInt("id_historico_peso");
				int codigoUsuario = rs.getInt("id_usuario");
				java.sql.Date dt_cadastro = rs.getDate("dt_cadastro");
				int valor = rs.getInt("peso");
				String observacao = rs.getString("ob_observacao");
				 
				Calendar c_dt_cadastro = Calendar.getInstance();
				c_dt_cadastro.setTimeInMillis(dt_cadastro.getTime());
				
				peso = new HistoricoPeso(codigo, codigoUsuario, c_dt_cadastro, valor, observacao);
				
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return peso;
	}

	@Override
	public List<HistoricoPeso> listar(int idUsuario) {
		List<HistoricoPeso> lista = new ArrayList<HistoricoPeso>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT * FROM T_HTR_HISTORICO_PESO WHERE ID_USUARIO = ?");
			stmt.setInt(1, idUsuario);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				int codigo = rs.getInt("id_historico_peso");
				int codigoUsuario = rs.getInt("id_usuario");
				java.sql.Date dt_cadastro = rs.getDate("dt_cadastro");
				int valor = rs.getInt("peso");
				String observacao = rs.getString("ob_observacao");
				 
				Calendar c_dt_cadastro = Calendar.getInstance();
				c_dt_cadastro.setTimeInMillis(dt_cadastro.getTime());
				
				HistoricoPeso peso = new HistoricoPeso(codigo, codigoUsuario, c_dt_cadastro, valor, observacao);
				lista.add(peso);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lista;
	}

}
