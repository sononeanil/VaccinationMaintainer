package com.xoriant.vaccination.entiry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
public class ConsumerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String vaccinationCenterId;
	private String firstName;
	private String lastName;
	private String gender;
	private String age;
	private String location;
	private String identityType;
	private String identityNumber;

}
