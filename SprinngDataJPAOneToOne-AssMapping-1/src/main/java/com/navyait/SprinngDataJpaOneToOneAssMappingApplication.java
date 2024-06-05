package com.navyait;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.navyait.entity.Passport;
import com.navyait.entity.Person;
import com.navyait.repository.PersonRepository;

@SpringBootApplication
public class SprinngDataJpaOneToOneAssMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(SprinngDataJpaOneToOneAssMappingApplication.class, args);
		PersonRepository personRepository = context.getBean(PersonRepository.class);

		Person person = new Person();
		person.setPersonName("Srilatha");
		person.setPersonGender("Female");

		Passport passport = new Passport();
		passport.setPassportNumber("SR996623");
		passport.setIssuedDate(LocalDate.now());
		passport.setExpiryDate(LocalDate.now().plusYears(10));
		passport.setPerson(person);

		person.setPassport(passport);
		personRepository.save(person);

		/* personRepository.findById(1); */

	}

}
