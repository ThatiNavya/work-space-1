package com.navyait.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navyait.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
