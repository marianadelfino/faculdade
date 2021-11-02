package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_USUARIO")
@SequenceGenerator(name = "seqUsuario", sequenceName = "SQ_TB_USUARIO", allocationSize = 1)
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUsuario")
	@Column(name = "CD_USUARIO", nullable = false)
	private int id;

	@Column(name = "DS_USERNAME", nullable = false)
	private String username;

	@Column(name = "NM_USUARIO", nullable = false, length = 300)
	private String nome;

	@Column(name = "NM_SOBRENOME", length = 300)
	private String sobrenome;

	@Column(name = "DS_CPF", nullable = false, length = 20)
	private String cpf;

	public Usuario() {
		super();
	}

	public Usuario(int id, String username, String nome, String sobrenome, String cpf) {
		super();
		this.id = id;
		this.username = username;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
