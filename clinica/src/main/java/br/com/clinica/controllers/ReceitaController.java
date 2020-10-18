package br.com.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.clinica.model.entities.Consulta;
import br.com.clinica.model.entities.Receita;
import br.com.clinica.model.repositories.ConsultaRepository;
import br.com.clinica.model.repositories.ReceitaRepository;

@RestController
@RequestMapping("receita")
public class ReceitaController {
	
	
	@Autowired
	private ReceitaRepository receitaRepository;
	
	
	@GetMapping()
	public Iterable<Receita> getReceita(){
		return receitaRepository.findAll();
	}

}
