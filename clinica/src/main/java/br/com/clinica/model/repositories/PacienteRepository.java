package br.com.clinica.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.clinica.model.entities.Paciente;



public interface PacienteRepository extends CrudRepository<Paciente, Integer>{

	Paciente findOneByNome(String nome);

}
