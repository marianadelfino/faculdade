package br.com.fiap.dao;

import br.com.fiap.exception.DBException;

public interface GenericDAO<T, K> {

	void cadastrar(T entity) ;
	void salvar() throws DBException; 
	
}
