package com.xoriant.vaccination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xoriant.vaccination.entiry.VaccinationCentre;

public interface VaccinationCentreRepository extends JpaRepository<VaccinationCentre, Long>{

}
