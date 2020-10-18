package br.com.clinica.model.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Consulta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_consulta;
	
	private Date data_consulta;
	private float valor;
	private String descricao; 
	private String medico;
	private int fk_id_paciente;
	
	public Consulta() {
		
	}
	
	public Consulta(float valor, String descricao, String medido, int fk_id_paciente) {
		
		this.valor = valor;
		this.descricao = descricao;
		this.medico = medico;
		this.fk_id_paciente = fk_id_paciente;
	}

	public int getFk_id_paciente() {
		return fk_id_paciente;
	}

	public void setFk_id_paciente(int fk_id_paciente) {
		this.fk_id_paciente = fk_id_paciente;
	}

	public int getId_consulta() {
		return id_consulta;
	}

	public void setId_consulta(int id_consulta) {
		this.id_consulta = id_consulta;
	}

	public Date getData_consulta() {
		return data_consulta;
	}

	public void setData_consulta(Date data_consulta) {
		this.data_consulta = data_consulta;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}
	
	
	
}
