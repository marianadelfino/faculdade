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
@Table(name = "TB_EXEMPLAR")
@SequenceGenerator(name = "seqExemplar", sequenceName = "SQ_TB_EXEMPLAR", allocationSize = 1)
public class Exemplar {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqExemplar")
	@Column(name = "CD_EXEMPLAR", nullable = false)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_AQUISICAO")
	private Calendar dataAquisicao;

	@Column(name = "NR_SITUACAO", nullable = false)
	private int situacao;

	public Exemplar() {
		super();
	}

	public Exemplar(int id, Calendar dataAquisicao, int situacao) {
		super();
		this.id = id;
		this.dataAquisicao = dataAquisicao;
		this.situacao = situacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(Calendar dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

}
