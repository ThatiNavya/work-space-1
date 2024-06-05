package com.navyait;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.navyait.entity.Address;
import com.navyait.entity.Employee;
import com.navyait.repository.EmployeeRepository;

@SpringBootApplication
public class SprinngDataJpaOneToManyAssMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SprinngDataJpaOneToManyAssMappingApplication.class, args);
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
	
		/*
		 * Employee emp = new Employee(); emp.setEmpName("Karthika");
		 * emp.setEmpSalary(950000.0);
		 * 
		 * Address add1 = new Address(); add1.setCity("Choutuppal");
		 * add1.setState("Telangana"); add1.setCountry("India"); add1.setEmp(emp);
		 * 
		 * Address add2 = new Address(); add2.setCity("Hyderabad");
		 * add2.setState("Telangana"); add2.setCountry("India"); add2.setEmp(emp);
		 * 
		 * 
		 * List<Address> listOfAddresses =Arrays.asList(add1,add2);
		 * emp.setAddress(listOfAddresses);
		 * 
		 * 
		 * employeeRepository.save(emp);
		 */     
	    employeeRepository.deleteById(1); 
	
	}

}
