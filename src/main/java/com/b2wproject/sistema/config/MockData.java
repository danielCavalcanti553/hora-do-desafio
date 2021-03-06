package com.b2wproject.sistema.config;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.b2wproject.sistema.domain.Planeta;
import com.b2wproject.sistema.repository.PlanetaRepository;

@Configuration
@Profile("test")
public class MockData implements CommandLineRunner{
	
	@Autowired
	private PlanetaRepository planetaRepository;

	@Override
	public void run(String... args) throws Exception {
		
		planetaRepository.deleteAll();
		Planeta p1 = new Planeta(null,"Terra","Temperate","Forests, mountains, lakes",0);
		Planeta p2 = new Planeta(null,"Marte","Arid","rock, desert, mountain",0);
		Planeta p3 = new Planeta(null,"Naboo","Temperate","Grassy hills, swamps, forests, mountains",4);
		planetaRepository.saveAll(Arrays.asList(p1,p2,p3));
		
	}

}
