package br.com.clinica.model.entities;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_paciente;
	
	private String nome;
	private String endereco;
	private Date data_nascimento;
	private String telefone;
	private Date data_primeira_consulta;
	private String email;
	private int peso;
	private int altura;
	private String cpf;
	
public Paciente() {
		
	}
	
	public Paciente(String nome, String endereco, String telefone, String email, int peso, int altura, String cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.peso = peso;
		this.altura = altura;
		this.cpf = cpf;
	}

	public int getId_paciente() {
		return id_paciente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getData_primeira_consulta() {
		return data_primeira_consulta;
	}

	public void setData_primeira_consulta(Date data_primeira_consulta) {
		this.data_primeira_consulta = data_primeira_consulta;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
}
