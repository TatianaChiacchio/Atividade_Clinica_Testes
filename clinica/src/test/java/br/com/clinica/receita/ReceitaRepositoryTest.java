package br.com.clinica.receita;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.clinica.model.entities.Paciente;
import br.com.clinica.model.entities.Receita;
import br.com.clinica.model.repositories.ReceitaRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ReceitaRepositoryTest {
	
	@Autowired
	ReceitaRepository receitaRepository;
	
	
	@Test
	public void veificaDescricaoNull() {
		Receita receita = new Receita("Receita de óculos", 1, "óculos para leitura");
		this.receitaRepository.save(receita);
		Receita receitaDb = this.receitaRepository.findOneById_receita(receita.getId_receita());
		Assertions.assertThat(receitaDb.getDescricao()).isNotNull();
	}
	
	@Test
	public void veificaTempoNull() {
		Receita receita = new Receita("Receita de óculos", 1, "óculos para leitura");
		this.receitaRepository.save(receita);
		Receita receitaDb = this.receitaRepository.findOneById_receita(receita.getId_receita());
		Assertions.assertThat(receitaDb.getTempo()).isNotNull();
	}
	
	@Test
	public void veificaDosagemNull() {
		Receita receita = new Receita("Receita de óculos", 1, "óculos para leitura");
		this.receitaRepository.save(receita);
		Receita receitaDb = this.receitaRepository.findOneById_receita(receita.getId_receita());
		Assertions.assertThat(receitaDb.getDosagem()).isNotNull();
	}

}
