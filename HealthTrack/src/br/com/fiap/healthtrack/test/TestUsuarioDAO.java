package br.com.fiap.healthtrack.test;

import java.util.Calendar;

import br.com.fiap.healthtrack.bean.Usuario;
import br.com.fiap.healthtrack.dao.UsuarioDAO;
import br.com.fiap.healthtrack.exception.DBException;
import br.com.fiap.healthtrack.factory.DAOFactory;
import br.com.fiap.healthtrack.util.CriptografiaUtils;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		System.out.println("Inicio TestUsuarioDAO");
		
		
		try {
			String senha = CriptografiaUtils.criptografar("123");
			System.out.println(senha);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		UsuarioDAO dao = DAOFactory.getUsuarioDAO();

		Usuario usuario = new Usuario(0, "jb", "tp", 'M', Calendar.getInstance(), Calendar.getInstance(), "jose.de.paula@live.com", Calendar.getInstance());
		usuario.setSenha("123");
		try {
			dao.cadastrar(usuario);
			System.out.println(usuario.getSenha());
			System.out.println("Usuario cadastrado com sucesso!");
		} catch (DBException e) {
			e.printStackTrace();
		}
		
//		try {
//			System.out.println(usuario.getSenha());
//			usuario = dao.buscar(usuario.getEmail(), usuario.getSenha());
//			System.out.println(usuario.getEmail() + usuario.getSenha());
//			System.out.println("Usuario encontrado com sucesso!");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			usuario.setNm_nome("alterei");
//			dao.atualizar(usuario);
//			System.out.println(usuario.getSenha());
//			System.out.println("Usuario atualizado com sucesso!");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
