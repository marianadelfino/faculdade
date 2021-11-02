package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;
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

public class oldTeste_Persistir_ALL {

	/*
	public static void main(String[] args) {
		Editora editora = new Editora(0, "2358978750001", "Nova Editora", "Av. Lins de Vasconcelos, 1222");
		EditoraDAO dao = new EditoraDAOImpl();

		Livro livro = new Livro(0, "O Retrato de Dorian Gray", (float) 54.79, new GregorianCalendar(2014, Calendar.DECEMBER, 1), null);
		LivroDAO dao = new LivroDAOImpl();

		Autor autor = new Autor(0, "Hans Christian", 1, "Andersen", new GregorianCalendar(1805, Calendar.APRIL, 2));
		AutorDAO dao = new AutorDAOImpl();

		try {
			dao.cadastrar(editora);
			System.out.println("Editora cadastrada!");

			dao.cadastrar(livro);
			System.out.println("Livro cadastrado!");

			dao.cadastrar(autor);
			System.out.println("Autor cadastrado!");
		} catch (DBException e) {
			System.out.println("Erro ao cadastrar!");
		}

		System.exit(0);
	}
	*/

}
