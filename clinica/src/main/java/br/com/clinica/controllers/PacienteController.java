package br.com.clinica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.clinica.model.entities.Paciente;
import br.com.clinica.model.repositories.PacienteRepository;



@RestController
@RequestMapping("paciente")
public class PacienteController {
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	
	@GetMapping()
	public Iterable<Paciente> getPacientes(){
		return pacienteRepository.findAll();
	}

}
