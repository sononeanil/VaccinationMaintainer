package com.xoriant.vaccination;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.xoriant.vaccination.entiry.Consumer;
import com.xoriant.vaccination.entiry.VaccinationCentre;
import com.xoriant.vaccination.repository.ConsumerRepository;

@SpringBootApplication
public class VaccinationMaintainerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(VaccinationMaintainerApplication.class, args);
	}

	@Autowired
	private ConsumerRepository consumerRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		VaccinationCentre vaccinationCentre = new VaccinationCentre(0, "PCMC School", "Pune", "Covishiedl", "Paid", "Pawar", "Sunita");
		VaccinationCentre vaccinationCentre1 = new VaccinationCentre(0, "PCMC School", "Wakad", "Covishiedl", "Free", "Singh", "Prarthana");
		
		ArrayList<VaccinationCentre> lstCVaccinationCentres = new ArrayList<>(2);
		lstCVaccinationCentres.add(vaccinationCentre);
		lstCVaccinationCentres.add(vaccinationCentre1);
		
		Consumer consumerEntity = new Consumer(0,"Anil", "Sonone", "M", "40", "Pune", "Aadhar Card", "Abcd", lstCVaccinationCentres);
		consumerRepository.save(consumerEntity);
	}

}
