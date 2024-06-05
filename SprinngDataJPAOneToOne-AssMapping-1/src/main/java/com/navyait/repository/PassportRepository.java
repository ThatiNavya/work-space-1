package com.navyait.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navyait.entity.Passport;

public interface PassportRepository extends JpaRepository<Passport,Integer>{

}
