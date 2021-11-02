package br.com.fiap.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import br.com.fiap.dao.GenericDAO;
import br.com.fiap.exception.DBException;

public class GenericDAOImpl<T, K> implements GenericDAO<T, K> {
	private EntityManager em; 
	
	
	private Class<T> classe;

	@SuppressWarnings("unchecked")
	public GenericDAOImpl(EntityManager em) {
		this.em = em; 
		classe = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

	}

	@Override
	public void cadastrar(T entity) {
			em.persist(entity);	
		}
	


	
	public void salvar() throws DBException{
		try{
		em.getTransaction().begin();
		em.getTransaction().commit();
		}catch (Exception e) {
			
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			throw new DBException("Erro no commit", e);
		}
		
	}
	

}
