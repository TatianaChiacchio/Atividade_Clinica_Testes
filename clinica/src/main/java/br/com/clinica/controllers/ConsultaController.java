package br.com.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.clinica.model.entities.Consulta;
import br.com.clinica.model.entities.Paciente;
import br.com.clinica.model.repositories.ConsultaRepository;


@RestController
@RequestMapping("consulta")
public class ConsultaController {
	
	@Autowired
	private ConsultaRepository consultaRepository;
	
	
	@GetMapping()
	public Iterable<Consulta> getConsulta(){
		return consultaRepository.findAll();
	}

}
