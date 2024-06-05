package com.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.Student;

public interface StudentRepo extends CrudRepository<Student,Integer> {

	
	 List<Student> findByStudentName(String name);
}
