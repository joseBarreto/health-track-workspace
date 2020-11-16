package br.com.fiap.healthtrack.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.fiap.healthtrack.bean.Usuario;
import br.com.fiap.healthtrack.dao.UsuarioDAO;
import br.com.fiap.healthtrack.exception.DBException;
import br.com.fiap.healthtrack.singleton.ConnectionManager;

public class OracleUsuarioDAO implements UsuarioDAO {

	private Connection conexao;

	@Override
	public void cadastrar(Usuario usuario) throws DBException {
		PreparedStatement stmt = null;
		try {

			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "INSERT INTO T_HTR_USUARIO (ID_USUARIO, NM_NOME, SOBRENOME, SEXO, DT_NASCIMENTO, DT_CADASTRO, EMAIL, SENHA, DT_ULTIMO_ACESSO) "
					+ "VALUES (SQ_T_HTR_USUARIO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?)";

			java.sql.Date dt_nascimento = new java.sql.Date(usuario.getDt_nascimento().getTimeInMillis());
			java.sql.Date dt_cadastro = new java.sql.Date(usuario.getDt_cadastro().getTimeInMillis());
			java.sql.Date dt_ultimo_acesso = new java.sql.Date(usuario.getDt_ultimo_acesso().getTimeInMillis());

			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getNm_nome());
			stmt.setString(2, usuario.getSobrenome());
			stmt.setString(3, String.valueOf(usuario.getSexo()));
			stmt.setDate(4, dt_nascimento);
			stmt.setDate(5, dt_cadastro);
			stmt.setString(6, usuario.getEmail());
			stmt.setString(7, usuario.getSenha());
			stmt.setDate(8, dt_ultimo_acesso);

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Erro ao cadastradar.");
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
	public void atualizar(Usuario usuario) throws DBException {
		PreparedStatement stmt = null;

		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String sql = "UPDATE T_HTR_USUARIO SET NM_NOME = ?, SOBRENOME = ?, SEXO = ?, DT_NASCIMENTO = ?, DT_CADASTRO = ?, EMAIL = ?, SENHA = ?, DT_ULTIMO_ACESSO = ? WHERE ID_USUARIO = ?";

			java.sql.Date dt_nascimento = new java.sql.Date(usuario.getDt_nascimento().getTimeInMillis());
			java.sql.Date dt_cadastro = new java.sql.Date(usuario.getDt_cadastro().getTimeInMillis());
			java.sql.Date dt_ultimo_acesso = new java.sql.Date(usuario.getDt_ultimo_acesso().getTimeInMillis());

			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getNm_nome());
			stmt.setString(2, usuario.getSobrenome());
			stmt.setString(3, String.valueOf(usuario.getSexo()));
			stmt.setDate(4, dt_nascimento);
			stmt.setDate(5, dt_cadastro);
			stmt.setString(6, usuario.getEmail());
			stmt.setString(7, usuario.getSenha());
			stmt.setDate(8, dt_ultimo_acesso);
			stmt.setInt(9, usuario.getId_usuario());

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Erro ao cadastradar.");
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
	public Usuario buscar(String email, String senha) {
		Usuario usuario = null;

		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT * FROM T_HTR_USUARIO WHERE EMAIL = ? AND SENHA = ? ");
			stmt.setString(1, email);
			stmt.setString(2, senha);
			rs = stmt.executeQuery();

			if (rs.next()) {
				int codigo = rs.getInt("ID_USUARIO");
				String nome = rs.getString("NM_NOME");
				String sobrenome = rs.getString("SOBRENOME");
				String sexo = rs.getString("SEXO");
				java.sql.Date dt_nascimento = rs.getDate("DT_NASCIMENTO");
				java.sql.Date dt_cadastro = rs.getDate("DT_NASCIMENTO");
				String _email = rs.getString("EMAIL");
				java.sql.Date dt_ultimo_acesso = rs.getDate("DT_ULTIMO_ACESSO");

				Calendar c_dt_nascimento = Calendar.getInstance();
				Calendar c_dt_cadastro = Calendar.getInstance();
				Calendar c_dt_ultimo_acesso = Calendar.getInstance();

				c_dt_nascimento.setTimeInMillis(dt_nascimento.getTime());
				c_dt_cadastro.setTimeInMillis(dt_cadastro.getTime());
				c_dt_ultimo_acesso.setTimeInMillis(dt_ultimo_acesso.getTime());

				usuario = new Usuario(codigo, nome, sobrenome, sexo.charAt(0), c_dt_nascimento, c_dt_cadastro, _email,
						c_dt_ultimo_acesso);
			}

		} catch (SQLException e) {
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

		return usuario;
	}

	
	@Override
	public boolean jaCadastrado(String email) {
		
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT * FROM T_HTR_USUARIO WHERE EMAIL = ?");
			stmt.setString(1, email);
			
			rs = stmt.executeQuery();

			if (rs.next()) {
				return true;
			}

		} catch (SQLException e) {
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

		return false;
	}
}
