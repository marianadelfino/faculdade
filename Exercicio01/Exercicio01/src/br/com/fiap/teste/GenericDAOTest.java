package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Test;
import br.com.fiap.dao.AutorDAO;
import br.com.fiap.dao.EditoraDAO;
import br.com.fiap.dao.LivroDAO;
import br.com.fiap.dao.impl.AutorDAOImpl;
import br.com.fiap.dao.impl.EditoraDAOImpl;
import br.com.fiap.dao.impl.LivroDAOImpl;
import br.com.fiap.entity.Autor;
import br.com.fiap.entity.Editora;
import br.com.fiap.entity.Livro;
import br.com.fiap.exception.DBException;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class GenericDAOTest {

	@Test
	public void cadastraEditoraTest() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		EditoraDAO dao = new EditoraDAOImpl(em);
		Editora editora = new Editora();
		editora.setCnpj("0000500001");
		editora.setNome("Nova Editora");
		editora.setEndereco("Av. Lins de Vasconcelos, 1222");

		try {
			dao.cadastrar(editora);
			dao.salvar();
			Assert.assertNotEquals(editora.getId(), 0);
		} catch (DBException e) {
			e.printStackTrace();
			Assert.fail();
		} finally {

			em.close();
		}

	}



	@Test
	public void cadastraAutorTest() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		AutorDAO dao = new AutorDAOImpl(em);
		Autor autor = new Autor();
		autor.setNome("Hans Christian");
		autor.setSexo(1);
		autor.setSobrenome("Andersen");
		autor.setDataNascimento(new GregorianCalendar(1805, Calendar.APRIL, 2));

		try {
			dao.cadastrar(autor);
			dao.salvar();
			Assert.assertNotEquals(autor.getId(), 0);
		} catch (DBException e) {
			e.printStackTrace();
			Assert.fail();
		} finally {

			em.close();
		}

	}




	@Test
	public void cadastraLivroTest() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		LivroDAO dao = new LivroDAOImpl(em);
		Livro livro = new Livro();
		livro.setIsbn(1654847982);
		livro.setTitulo("O Retrato de Dorian Gray");
		livro.setPreco((float) 54.79);
		livro.setDataLancamento(new GregorianCalendar(2014, Calendar.DECEMBER, 1));

		try {
			dao.cadastrar(livro);
			dao.salvar();
			Assert.assertNotEquals(livro.getId(), 0);
		} catch (DBException e) {
			e.printStackTrace();
			Assert.fail();
		} finally {

			em.close();
		}

	}


}