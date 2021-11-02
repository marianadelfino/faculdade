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
@Table(name = "TB_EMPRESTIMO")
@SequenceGenerator(name = "seqEmprestimo", sequenceName = "SQ_TB_EMPRESTIMO", allocationSize = 1)
public class Emprestimo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqEmprestimo")
	@Column(name = "CD_EMPRESTIMO", nullable = false)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_EMPRESTIMO", nullable = false)
	private Calendar dataEmprestimo;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_RETORNO", nullable = false)
	private Calendar dataRetorno;

	public Emprestimo() {
		super();
	}

	public Emprestimo(int id, Calendar dataEmprestimo, Calendar dataRetorno) {
		super();
		this.id = id;
		this.dataEmprestimo = dataEmprestimo;
		this.dataRetorno = dataRetorno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Calendar dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Calendar getDataRetorno() {
		return dataRetorno;
	}

	public void setDataRetorno(Calendar dataRetorno) {
		this.dataRetorno = dataRetorno;
	}

}
