package br.com.fiap.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	private static EntityManagerFactory fabrica;

	private EntityManagerFactorySingleton() {}

	public static EntityManagerFactory getInstance() {

		if (fabrica == null) {
			fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		}

		return fabrica;
	}
}
