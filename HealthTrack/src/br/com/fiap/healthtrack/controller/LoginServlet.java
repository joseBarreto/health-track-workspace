package br.com.fiap.healthtrack.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.healthtrack.bean.Usuario;
import br.com.fiap.healthtrack.dao.UsuarioDAO;
import br.com.fiap.healthtrack.exception.DBException;
import br.com.fiap.healthtrack.factory.DAOFactory;
import br.com.fiap.healthtrack.util.CriptografiaUtils;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UsuarioDAO usuarioDAO;

	public LoginServlet() {
		super();
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		usuarioDAO = DAOFactory.getUsuarioDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("user", null);
		session.invalidate();
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");
		switch (acao) {
		case "cadastrar":
			cadastrarUsuario(request, response);
			break;
		case "login":
			logarUsuario(request, response);
			break;
		}
	}

	private void cadastrarUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String nome = request.getParameter("nome");
			String sobrenome = request.getParameter("sobrenome");
			String sexo = request.getParameter("gender");
			String email = request.getParameter("email");
			String senha = request.getParameter("senha");
			String senhaConfirma = request.getParameter("senhaConfirma");

			if (!senha.equals(senhaConfirma)) {
				request.setAttribute("erro", "As senhas não conferem");
				request.getRequestDispatcher("register.jsp").forward(request, response);
				return;
			}else if(usuarioDAO.jaCadastrado(email)) {
				request.setAttribute("erro", "E-mail já cadastrado!");
				request.getRequestDispatcher("register.jsp").forward(request, response);
				return;
			}

			Calendar c_dt_nascimento = Calendar.getInstance();
			Calendar c_dt_cadastro = Calendar.getInstance();
			Calendar c_dt_ultimo_acesso = Calendar.getInstance();

			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
			c_dt_nascimento.setTime(format.parse(request.getParameter("dt_nascimento")));

			Usuario usuario = new Usuario(0, nome, sobrenome, sexo.charAt(0), c_dt_cadastro, c_dt_nascimento, email,
					c_dt_ultimo_acesso);
			usuario.setSenha(senha);
			usuarioDAO.cadastrar(usuario);

			request.setAttribute("msg", "Usuario registrado com sucesso!");
			request.getRequestDispatcher("login.jsp").forward(request, response);

		} catch (DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao registrar o usuario");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Por favor, valide os dados e tente novamente");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}

	}

	private void logarUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String email = request.getParameter("email");
			String senha = CriptografiaUtils.criptografar(request.getParameter("senha"));
			Usuario usuario = usuarioDAO.buscar(email, senha);

			if (usuario != null) {
				HttpSession session = request.getSession();
				session.setAttribute("user", usuario);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			} else {
				throw new Exception("invalid user");
			}
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Usuário e/ou senha inválidos");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

	}
}
