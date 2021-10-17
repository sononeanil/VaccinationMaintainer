package com.xoriant.vaccination.entiry;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "consumer")
public class Consumer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long consumerId;
	private String firstName;
	private String lastName;
	  private String gender; 
	  private String age; 
	  private String location; 
	  private String identityType; 
	  private String identityNumber;
	 
	
	  @OneToMany(cascade = CascadeType.ALL)
	  @JoinColumn(name = "consumer_foreignKey", referencedColumnName="consumerId")
	  List<VaccinationCentre> lstVaccinationCentre = new ArrayList<>(2);
	 

}
