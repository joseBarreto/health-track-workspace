package br.com.fiap.healthtrack.dao;

import java.util.List;

import br.com.fiap.healthtrack.bean.Produto;
import br.com.fiap.healthtrack.exception.DBException;

public interface ProdutoDAO {

	void cadastrar(Produto produto) throws DBException;

	void atualizar(Produto produto) throws DBException;

	void remover(int codigo) throws DBException;

	Produto buscar(int id);

	List<Produto> listar();
}
