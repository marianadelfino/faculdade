package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import org.junit.Assert;
import org.junit.Test;

import br.com.fiap.dao.AutorDAO;
import br.com.fiap.dao.EditoraDAO;
import br.com.fiap.dao.EmprestimoDAO;
import br.com.fiap.dao.ExemplarDAO;
import br.com.fiap.dao.LivroDAO;
import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.dao.impl.AutorDAOImpl;
import br.com.fiap.dao.impl.EditoraDAOImpl;
import br.com.fiap.dao.impl.EmprestimoDAOImpl;
import br.com.fiap.dao.impl.ExemplarDAOImpl;
import br.com.fiap.dao.impl.LivroDAOImpl;
import br.com.fiap.dao.impl.UsuarioDAOImpl;
import br.com.fiap.entity.Autor;
import br.com.fiap.entity.Editora;
import br.com.fiap.entity.Emprestimo;
import br.com.fiap.entity.Exemplar;
import br.com.fiap.entity.Livro;
import br.com.fiap.entity.Usuario;
import br.com.fiap.exception.DBException;
import br.com.fiap.exception.IdNotFoundException;
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
	public void buscaEditoraTest() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		EditoraDAO dao = new EditoraDAOImpl(em);
		Editora editora = new Editora();
		editora.setCnpj("0000500001");
		editora.setNome("Nova Editora");
		editora.setEndereco("Av. Lins de Vasconcelos, 1222");

		try {
			dao.cadastrar(editora);
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
			Assert.fail("Erro no cadastro");

		}

		Editora busca = dao.pesquisar(editora.getId());

		Assert.assertNotNull(busca);

		em.close();
	}

	@Test
	public void removeEditoraTest() throws IdNotFoundException {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		EditoraDAO dao = new EditoraDAOImpl(em);
		Editora editora = new Editora();
		editora.setCnpj("0000500001");
		editora.setNome("Nova Editora");
		editora.setEndereco("Av. Lins de Vasconcelos, 1222");

		try {
			dao.cadastrar(editora);
			dao.salvar();

			dao.remover(editora.getId());
			dao.salvar();

			Editora busca = dao.pesquisar(editora.getId());
			Assert.assertNull(busca);

		} catch (DBException e) {
			e.printStackTrace();

		} finally {
			em.close();

		}

	}

	@Test
	public void atualizaEditoraTest() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		EditoraDAO dao = new EditoraDAOImpl(em);
		Editora editora = new Editora();
		editora.setCnpj("0000500001");
		editora.setNome("Nova Editora");
		editora.setEndereco("Av. Lins de Vasconcelos, 1222");

		try {
			dao.cadastrar(editora);
			dao.salvar();

			editora.setCnpj("0000500001222222");
			editora.setNome("Nova Editora Nova 2");

			dao.alterar(editora);
			dao.salvar();

			Editora busca = dao.pesquisar(editora.getId());
			Assert.assertEquals(busca.getCnpj(), "0000500001222222");
			Assert.assertEquals(busca.getNome(), "Nova Editora Nova 2");

		} catch (DBException e) {
			e.printStackTrace();
		}
		em.close();

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
	public void buscaAutorTest() {
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
		} catch (DBException e) {
			e.printStackTrace();
			Assert.fail("Erro no cadastro");

		}

		Autor busca = dao.pesquisar(autor.getId());

		Assert.assertNotNull(busca);

		em.close();
	}

	@Test
	public void removeAutorTest() throws IdNotFoundException {
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

			dao.remover(autor.getId());
			dao.salvar();

			Autor busca = dao.pesquisar(autor.getId());
			Assert.assertNull(busca);

		} catch (DBException e) {
			e.printStackTrace();

		} finally {
			em.close();

		}

	}

	@Test
	public void atualizaAutorTest() {
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

			autor.setNome("Oscar");
			autor.setSexo(1);
			autor.setSobrenome("Wilde");
			autor.setDataNascimento(new GregorianCalendar(1854, Calendar.OCTOBER, 16));

			dao.alterar(autor);
			dao.salvar();

			Autor busca = dao.pesquisar(autor.getId());
			Assert.assertEquals(busca.getNome(), "Oscar");
			Assert.assertEquals(busca.getSobrenome(), "Wilde");

		} catch (DBException e) {
			e.printStackTrace();
		}
		em.close();

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

	@Test
	public void buscaLivroTest() {
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
		} catch (DBException e) {
			e.printStackTrace();
			Assert.fail("Erro no cadastro");

		}

		Livro busca = dao.pesquisar(livro.getId());

		Assert.assertNotNull(busca);

		em.close();
	}

	@Test
	public void removeLivroTest() throws IdNotFoundException {
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

			dao.remover(livro.getId());
			dao.salvar();

			Livro busca = dao.pesquisar(livro.getId());
			Assert.assertNull(busca);

		} catch (DBException e) {
			e.printStackTrace();

		} finally {
			em.close();

		}

	}

	@SuppressWarnings("deprecation")
	@Test
	public void atualizaLivroTest() {
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

			livro.setPreco((float) 89.99);

			dao.alterar(livro);
			dao.salvar();

			Livro busca = dao.pesquisar(livro.getId());

			Assert.assertEquals(busca.getPreco(), (float) 89.99);

		} catch (DBException e) {
			e.printStackTrace();
		}
		em.close();

	}

	@Test
	public void cadastraUsuarioTest() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		UsuarioDAO dao = new UsuarioDAOImpl(em);
		Usuario usuario = new Usuario();
		usuario.setUsername("mariamaria");
		usuario.setNome("Maria");
		usuario.setSobrenome("Silva");
		usuario.setCpf("12345678909");

		try {
			dao.cadastrar(usuario);
			dao.salvar();
			Assert.assertNotEquals(usuario.getId(), 0);
		} catch (DBException e) {
			e.printStackTrace();
			Assert.fail();
		} finally {

			em.close();
		}

	}

	@Test
	public void buscaUsuarioTest() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		UsuarioDAO dao = new UsuarioDAOImpl(em);
		Usuario usuario = new Usuario();
		usuario.setUsername("mariamaria");
		usuario.setNome("Maria");
		usuario.setSobrenome("Silva");
		usuario.setCpf("12345678909");

		try {
			dao.cadastrar(usuario);
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
			Assert.fail("Erro no cadastro");

		}

		Usuario busca = dao.pesquisar(usuario.getId());

		Assert.assertNotNull(busca);

		em.close();
	}

	@Test
	public void removeUsuarioTest() throws IdNotFoundException {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		UsuarioDAO dao = new UsuarioDAOImpl(em);
		Usuario usuario = new Usuario();
		usuario.setUsername("mariamaria");
		usuario.setNome("Maria");
		usuario.setSobrenome("Silva");
		usuario.setCpf("12345678909");

		try {
			dao.cadastrar(usuario);
			dao.salvar();

			dao.remover(usuario.getId());
			dao.salvar();

			Usuario busca = dao.pesquisar(usuario.getId());
			Assert.assertNull(busca);

		} catch (DBException e) {
			e.printStackTrace();

		} finally {
			em.close();

		}

	}

	@Test
	public void atualizaUsuarioTest() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		UsuarioDAO dao = new UsuarioDAOImpl(em);
		Usuario usuario = new Usuario();
		usuario.setUsername("mariamaria");
		usuario.setNome("Maria");
		usuario.setSobrenome("Silva");
		usuario.setCpf("12345678909");

		try {
			dao.cadastrar(usuario);
			dao.salvar();

			usuario.setUsername("josejose");
			usuario.setNome("Jose");
			usuario.setSobrenome("Santos");
			usuario.setCpf("45632145698");

			dao.alterar(usuario);
			dao.salvar();

			Usuario busca = dao.pesquisar(usuario.getId());

			Assert.assertEquals(busca.getUsername(), "josejose");
			Assert.assertEquals(busca.getNome(), "Jose");
			Assert.assertEquals(busca.getSobrenome(), "Santos");
			Assert.assertEquals(busca.getCpf(), "45632145698");

		} catch (DBException e) {
			e.printStackTrace();
		}
		em.close();

	}

	@Test
	public void cadastraEmprestimoTest() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		EmprestimoDAO dao = new EmprestimoDAOImpl(em);
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setDataEmprestimo(new GregorianCalendar(2017, Calendar.MARCH, 2));
		emprestimo.setDataRetorno(new GregorianCalendar(2017, Calendar.MARCH, 9));

		try {
			dao.cadastrar(emprestimo);
			dao.salvar();
			Assert.assertNotEquals(emprestimo.getId(), 0);
		} catch (DBException e) {
			e.printStackTrace();
			Assert.fail();
		} finally {

			em.close();
		}

	}

	@Test
	public void buscaEmprestimoTest() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		EmprestimoDAO dao = new EmprestimoDAOImpl(em);
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setDataEmprestimo(new GregorianCalendar(2017, Calendar.MARCH, 2));
		emprestimo.setDataRetorno(new GregorianCalendar(2017, Calendar.MARCH, 9));

		try {
			dao.cadastrar(emprestimo);
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
			Assert.fail("Erro no cadastro");

		}

		Emprestimo busca = dao.pesquisar(emprestimo.getId());

		Assert.assertNotNull(busca);

		em.close();
	}

	@Test
	public void removeEmprestimoTest() throws IdNotFoundException {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		EmprestimoDAO dao = new EmprestimoDAOImpl(em);
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setDataEmprestimo(new GregorianCalendar(2017, Calendar.MARCH, 2));
		emprestimo.setDataRetorno(new GregorianCalendar(2017, Calendar.MARCH, 9));

		try {
			dao.cadastrar(emprestimo);
			dao.salvar();

			dao.remover(emprestimo.getId());
			dao.salvar();

			Emprestimo busca = dao.pesquisar(emprestimo.getId());
			Assert.assertNull(busca);

		} catch (DBException e) {
			e.printStackTrace();

		} finally {
			em.close();

		}

	}

	@Test
	public void atualizaEmprestimoTest() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		EmprestimoDAO dao = new EmprestimoDAOImpl(em);
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setDataEmprestimo(new GregorianCalendar(2017, Calendar.MARCH, 2));
		emprestimo.setDataRetorno(new GregorianCalendar(2017, Calendar.MARCH, 9));

		try {
			dao.cadastrar(emprestimo);
			dao.salvar();

			emprestimo.setDataEmprestimo(new GregorianCalendar(2017, Calendar.MARCH, 3));
			emprestimo.setDataRetorno(new GregorianCalendar(2017, Calendar.MARCH, 10));

			dao.alterar(emprestimo);
			dao.salvar();

			Emprestimo busca = dao.pesquisar(emprestimo.getId());

			Assert.assertEquals(busca.getDataEmprestimo(), new GregorianCalendar(2017, Calendar.MARCH, 3));
			Assert.assertEquals(busca.getDataRetorno(), new GregorianCalendar(2017, Calendar.MARCH, 10));

		} catch (DBException e) {
			e.printStackTrace();
		}
		em.close();

	}

	@Test
	public void cadastraExemplarTest() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ExemplarDAO dao = new ExemplarDAOImpl(em);
		Exemplar exemplar = new Exemplar();

		exemplar.setDataAquisicao(new GregorianCalendar(2017, Calendar.MARCH, 02));
		exemplar.setSituacao(1);

		try {
			dao.cadastrar(exemplar);
			dao.salvar();
			Assert.assertNotEquals(exemplar.getId(), 0);
		} catch (DBException e) {
			e.printStackTrace();
			Assert.fail();
		} finally {

			em.close();
		}

	}

	@Test
	public void buscaExemplarTest() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ExemplarDAO dao = new ExemplarDAOImpl(em);
		Exemplar exemplar = new Exemplar();

		exemplar.setDataAquisicao(new GregorianCalendar(2017, Calendar.MARCH, 02));
		exemplar.setSituacao(1);

		try {
			dao.cadastrar(exemplar);
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
			Assert.fail("Erro no cadastro");

		}

		Exemplar busca = dao.pesquisar(exemplar.getId());

		Assert.assertNotNull(busca);

		em.close();
	}

	@Test
	public void removeExemplarTest() throws IdNotFoundException {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ExemplarDAO dao = new ExemplarDAOImpl(em);
		Exemplar exemplar = new Exemplar();

		exemplar.setDataAquisicao(new GregorianCalendar(2017, Calendar.MARCH, 02));
		exemplar.setSituacao(1);

		try {
			dao.cadastrar(exemplar);
			dao.salvar();

			dao.remover(exemplar.getId());
			dao.salvar();

			Exemplar busca = dao.pesquisar(exemplar.getId());
			Assert.assertNull(busca);

		} catch (DBException e) {
			e.printStackTrace();

		} finally {
			em.close();

		}

	}

	@Test
	public void atualizaExemplarTest() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ExemplarDAO dao = new ExemplarDAOImpl(em);
		Exemplar exemplar = new Exemplar();

		exemplar.setDataAquisicao(new GregorianCalendar(2017, Calendar.MARCH, 02));
		exemplar.setSituacao(1);

		try {
			dao.cadastrar(exemplar);
			dao.salvar();

			exemplar.setDataAquisicao(new GregorianCalendar(2017, Calendar.MARCH, 01));
			exemplar.setSituacao(2);

			dao.alterar(exemplar);
			dao.salvar();

			Exemplar busca = dao.pesquisar(exemplar.getId());

			Assert.assertEquals(busca.getDataAquisicao(), new GregorianCalendar(2017, Calendar.MARCH, 01));
			Assert.assertEquals(busca.getSituacao(), 2);

		} catch (DBException e) {
			e.printStackTrace();
		}
		em.close();

	}

}