package br.com.clinica.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.clinica.model.entities.Receita;

public interface ReceitaRepository extends CrudRepository<Receita, Integer>{

	Receita findOneById_receita(int id_receita);

}
