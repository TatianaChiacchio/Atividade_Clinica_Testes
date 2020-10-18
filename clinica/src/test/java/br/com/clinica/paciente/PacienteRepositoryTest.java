package br.com.clinica.paciente;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.clinica.model.entities.Paciente;
import br.com.clinica.model.repositories.PacienteRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PacienteRepositoryTest {
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	@Test
	public void veificaIdPacienteNull() {
		Paciente paciente = new Paciente("Carlos Henrique", "Rua X", "(19)99999-9999", "chac@gamil.com", 109, 180,"123.455.654-98");
		this.pacienteRepository.save(paciente);
		Paciente pacienteDb = this.pacienteRepository.findOneByNome(paciente.getNome());
		Assertions.assertThat(pacienteDb.getId_paciente()).isNotNull();
		
		
	}
	
	@Test
	public void veificaPesoNull() {
		Paciente paciente = new Paciente("Carlos Henrique", "Rua X", "(19)99999-9999", "chac@gamil.com", 109, 180,"123.455.654-98");
		this.pacienteRepository.save(paciente);
		Paciente pacienteDb = this.pacienteRepository.findOneByNome(paciente.getNome());
		Assertions.assertThat(pacienteDb.getPeso()).isNotNull();
		
		
	}
	
	@Test
	public void veificaAlturaNull() {
		Paciente paciente = new Paciente("Carlos Henrique", "Rua X", "(19)99999-9999", "chac@gamil.com", 109, 180,"123.455.654-98");
		this.pacienteRepository.save(paciente);
		Paciente pacienteDb = this.pacienteRepository.findOneByNome(paciente.getNome());
		Assertions.assertThat(pacienteDb.getAltura()).isNotNull();
		
		
	}
	
	@Test
	public void veificaDataConsultaNull() {
		Paciente paciente = new Paciente("Carlos Henrique", "Rua X", "(19)99999-9999", "chac@gamil.com", 109, 180,"123.455.654-98");
		this.pacienteRepository.save(paciente);
		Paciente pacienteDb = this.pacienteRepository.findOneByNome(paciente.getNome());
		Assertions.assertThat(pacienteDb.getData_primeira_consulta()).isNotNull();
		
		
	}
}
