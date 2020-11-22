package br.com.fiap.healthtrack.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.healthtrack.bean.HistoricoBatimentoCardiaco;
import br.com.fiap.healthtrack.bean.HistoricoPeso;
import br.com.fiap.healthtrack.bean.Usuario;
import br.com.fiap.healthtrack.dao.HistoricoPesoDAO;
import br.com.fiap.healthtrack.exception.DBException;
import br.com.fiap.healthtrack.factory.DAOFactory;


@WebServlet("/weightControl")
public class WeightControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private HistoricoPesoDAO dao;
   
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		dao = DAOFactory.getHistoricoPesoDAO();
	}

	
    public WeightControlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String acao = request.getParameter("acao");
		switch (acao) {
		case "cadastrar":
			cadastrar(request, response);
			break;
		case "editar":
			editar(request, response);
			break;
		case "excluir":
			excluir(request, response);
			break;
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		if(acao == null)
		{
			acao = "";
		}
		switch (acao) {
		case "abrir-form-edicao":
			int id = Integer.parseInt(request.getParameter("codigo"));
			HistoricoPeso peso = dao.buscar(id);
			request.setAttribute("peso", peso);
			request.getRequestDispatcher("weight-control-register.jsp").forward(request, response);
			break;
		
		default:
			listar(request, response);
			break;
		}		
	}
	
	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idUsuario = ((Usuario) request.getSession().getAttribute("user")).getId_usuario();

		List<HistoricoPeso> lista = dao.listar(idUsuario);
		request.setAttribute("pesos", lista);
		request.getRequestDispatcher("weight-control.jsp").forward(request, response);
	}

	private void excluir(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		try {
			dao.remover(codigo);
			request.setAttribute("msg", "Historico de peso removido!");
		} catch (DBException e) {
			e.printStackTrace();
			request.setAttribute("erro", "Erro ao remover!");
		}

		listar(request, response);
	}

	private void editar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			int codigo = Integer.parseInt(request.getParameter("codigo"));			
			int valor = Integer.parseInt(request.getParameter("peso"));
			String observacao = request.getParameter("observacao");
			int idUsuario = ((Usuario) request.getSession().getAttribute("user")).getId_usuario();

			
			Calendar c_dt_nascimento = Calendar.getInstance();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			c_dt_nascimento.setTime(format.parse(request.getParameter("dt_cadastro")));
			
			HistoricoPeso peso = new HistoricoPeso(codigo, idUsuario, c_dt_nascimento, valor, observacao);			
			dao.atualizar(peso);

			request.setAttribute("msg", "Peso atualizado!");
		} catch (DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao atualizar");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Por favor, valide os dados");
		}
		listar(request, response);
	}

	private void cadastrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
						
			int valor = Integer.parseInt(request.getParameter("peso"));
			String observacao = request.getParameter("observacao");
			int idUsuario = ((Usuario) request.getSession().getAttribute("user")).getId_usuario();

			
			Calendar c_dt_nascimento = Calendar.getInstance();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			c_dt_nascimento.setTime(format.parse(request.getParameter("dt_cadastro")));
			
			HistoricoPeso peso = new HistoricoPeso(0, idUsuario, c_dt_nascimento, valor, observacao);			
			dao.cadastrar(peso);

			request.setAttribute("msg", "Produto cadastrado!");
		} catch (DBException db) {
			db.printStackTrace();
			request.setAttribute("erro", "Erro ao cadastrar");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("erro", "Por favor, valide os dados");
		}
		listar(request, response);
	}

}
