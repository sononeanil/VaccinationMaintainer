package com.xoriant.vaccination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.xoriant.vaccination.entiry.ConsumerEntity;
import com.xoriant.vaccination.repository.ConsumerRepository;

@SpringBootApplication
public class VaccinationMaintainerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(VaccinationMaintainerApplication.class, args);
	}

	@Autowired
	ConsumerRepository consumerRepo;
	@Override
	public void run(String... args) throws Exception {
		ConsumerEntity consumerEntity = new ConsumerEntity(0," "," ");
//		consumerRepo.save(consumerEntity);
	}

}
