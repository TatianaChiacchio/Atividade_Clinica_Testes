package br.com.clinica.consulta;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.clinica.model.entities.Consulta;
import br.com.clinica.model.entities.Paciente;
import br.com.clinica.model.repositories.ConsultaRepository;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ConsultaRepositoryTest {
	
	@Autowired
	ConsultaRepository consultaRepository;
	
	@Test
	public void veificaIdConsultaNull() {
		Consulta consulta = new Consulta(350, "consulta com o otorrino", "Dr. Ricardo", 1);
		this.consultaRepository.save(consulta);
		Consulta consultaDb = this.consultaRepository.findOneById_consulta(consulta.getId_consulta());
		Assertions.assertThat(consultaDb.getId_consulta()).isNotNull();
		
		
	}
	
	@Test
	public void veificaIdPacienteNull() {
		Consulta consulta = new Consulta(350, "consulta com o otorrino", "Dr. Ricardo", 1);
		this.consultaRepository.save(consulta);
		Consulta consultaDb = this.consultaRepository.findOneById_consulta(consulta.getId_consulta());
		Assertions.assertThat(consultaDb.getFk_id_paciente()).isNotNull();
		
		
	}
	
	@Test
	public void veificaMedicoNull() {
		Consulta consulta = new Consulta(350, "consulta com o otorrino", "Dr. Ricardo", 1);
		this.consultaRepository.save(consulta);
		Consulta consultaDb = this.consultaRepository.findOneById_consulta(consulta.getId_consulta());
		Assertions.assertThat(consultaDb.getMedico()).isNotNull();
		
		
	}
	
	

}
