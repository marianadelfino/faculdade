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
@Table(name = "TB_AUTOR")
@SequenceGenerator(name="seqAutor", sequenceName="SQ_AUTOR", allocationSize=1)  
public class Autor {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seqAutor") 
	@Column(name="CD_ID")
	private int id; 
	
	@Column(nullable=false,name="DS_NOME", length=300)
	private String nome; 
	
	
	@Column(nullable = false, name = "NR_SEXO")
	private int sexo; 
	
	@Column(nullable=false,name="DS_SOBRENOME", length=300)
	private String sobrenome; 
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_NASCIMENTO")
	private Calendar dataNascimento;
		
	
	public Autor() {
		super();
		
	}


	public Autor(int id, String nome, int sexo, String sobrenome, Calendar dataNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getSexo() {
		return sexo;
	}


	public void setSexo(int sexo) {
		this.sexo = sexo;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public Calendar getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	} 
		
}
