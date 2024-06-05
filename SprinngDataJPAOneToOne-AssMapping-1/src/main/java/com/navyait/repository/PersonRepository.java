package com.navyait.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navyait.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
