package br.com.fiap.healthtrack.test;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.healthtrack.bean.Produto;
import br.com.fiap.healthtrack.dao.ProdutoDAO;
import br.com.fiap.healthtrack.exception.DBException;
import br.com.fiap.healthtrack.factory.DAOFactory;

public class TestProdutoDAO {

	public static void main(String[] args) {
		ProdutoDAO dao = DAOFactory.getProdutoDAO();

		// Cadastrar um produto
		Produto produto = new Produto(0, "Caderno", 20, Calendar.getInstance(), 100);
		try {
			dao.cadastrar(produto);
			System.out.println("Produto cadastrado com sucesso!");
		} catch (DBException e) {
			e.printStackTrace();
		}

		// Lista os produtos
		List<Produto> lista = dao.listar();
		for (Produto item : lista) {
			System.out.println(item.getNome() + " " + item.getQuantidade() + " " + item.getValor());
		}

		// Buscar um produto pelo codigo e atualizar
		produto = dao.buscar(lista.get(lista.size() - 1).getCodigo());
		produto.setNome("Caderno capa dura");
		produto.setValor(30);
		try {
			dao.atualizar(produto);
			System.out.println("Produto atualizado com sucesso!");
		} catch (DBException e) {
			e.printStackTrace();
		}

		// Remover um produto
		try {
			dao.remover(lista.get(lista.size() - 1).getCodigo());
			System.out.println("Produto removido com sucesso!");
		} catch (DBException e) {
			e.printStackTrace();
		}
	}

}
