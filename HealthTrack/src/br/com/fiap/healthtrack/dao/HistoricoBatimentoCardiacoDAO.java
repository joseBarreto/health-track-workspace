package br.com.fiap.healthtrack.dao;

import java.util.List;

import br.com.fiap.healthtrack.bean.HistoricoBatimentoCardiaco;
import br.com.fiap.healthtrack.exception.DBException;

public interface HistoricoBatimentoCardiacoDAO {

	void cadastrar(HistoricoBatimentoCardiaco batimentoCardiaco) throws DBException;

	void atualizar(HistoricoBatimentoCardiaco batimentoCardiaco) throws DBException;

	void remover(int codigo) throws DBException;

	HistoricoBatimentoCardiaco buscar(int id);

	List<HistoricoBatimentoCardiaco> listar(int idUsuario);
}
