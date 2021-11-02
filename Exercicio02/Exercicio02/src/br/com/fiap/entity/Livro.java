package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_LIVRO")
@SequenceGenerator(name = "seqLivro", sequenceName = "SQ_TB_LIVRO", allocationSize = 1)
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqLivro")
	@Column(name = "CD_LIVRO", nullable = false)
	private int id;

	@Column(name = "NR_ISBN", nullable = false)
	private int isbn;

	@Column(nullable = false, name = "DS_TITULO", length = 200)
	private String titulo;

	@Column(name = "NR_PRECO")
	private float preco;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_LANCAMENTO")
	private Calendar dataLancamento;

	private byte[] capa;

	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livro(int id, int isbn, String titulo, float preco, Calendar dataLancamento, byte[] capa) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.titulo = titulo;
		this.preco = preco;
		this.dataLancamento = dataLancamento;
		this.capa = capa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Calendar getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public byte[] getCapa() {
		return capa;
	}

	public void setCapa(byte[] capa) {
		this.capa = capa;
	}

}
