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
		
		VaccinationCentre vaccinationCentre = new VaccinationCentre(0, "Nasik PCMC School", "Pune", "Co-Vaccine", "Paid", "sonone", "Sunita");
		VaccinationCentre vaccinationCentre1 = new VaccinationCentre(0, "Nagpur School", "Wakad", "Co-Vaccine", "Free", "Waghmare", "Prarthana");
		
		ArrayList<VaccinationCentre> lstCVaccinationCentres = new ArrayList<>(2);
		lstCVaccinationCentres.add(vaccinationCentre);
		lstCVaccinationCentres.add(vaccinationCentre1);
		
		
		Consumer consumerEntity = new Consumer(0,"PuneetKumar", "Chaddha", "M", "40", "Indore", "Pan Card", "Abcd", lstCVaccinationCentres);
		consumerRepository.save(consumerEntity);
		
		Consumer consumerEntity1 = new Consumer(1, "Sachin", null, null, null, null, null, null, null);	
		
		consumerRepository.save(consumerEntity1);
	}

}
