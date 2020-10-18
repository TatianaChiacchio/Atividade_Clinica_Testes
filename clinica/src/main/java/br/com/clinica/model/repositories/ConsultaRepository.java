package br.com.clinica.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.clinica.model.entities.Consulta;
import br.com.clinica.model.entities.Paciente;


public interface ConsultaRepository extends CrudRepository<Consulta, Integer>{

	Consulta findOneById_consulta(int id_consulta);

	Consulta findOneById(int id_consulta);

}
