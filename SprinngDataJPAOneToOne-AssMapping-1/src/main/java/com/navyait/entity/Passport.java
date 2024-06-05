package com.navyait.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 	private Integer passportId;
	
	private String passportNumber;
	
	private LocalDate issuedDate;
	
	private LocalDate expiryDate;
	
	@OneToOne
	@JoinColumn(name="person_id")
	private Person person;
	
}
