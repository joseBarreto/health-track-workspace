package br.com.fiap.healthtrack.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.healthtrack.bean.Produto;
import br.com.fiap.healthtrack.dao.ProdutoDAO;
import br.com.fiap.healthtrack.factory.DAOFactory;


@WebServlet("/ProdutoListarController")
public class ProdutoListarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	private ProdutoDAO dao;
	
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		dao =  DAOFactory.getProdutoDAO();
	}

	public ProdutoListarController() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Produto> lista = dao.listar();
		request.setAttribute("produtos", lista);
		request.getRequestDispatcher("lista-produto.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
