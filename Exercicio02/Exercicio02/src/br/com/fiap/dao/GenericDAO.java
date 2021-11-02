package br.com.fiap.dao;

import br.com.fiap.exception.DBException;
import br.com.fiap.exception.IdNotFoundException;

public interface GenericDAO<T, K> {

	T pesquisar(K codigo);

	void cadastrar(T entity);

	void alterar(T entity);

	void remover(K codigo) throws IdNotFoundException;

	void salvar() throws DBException;

}
