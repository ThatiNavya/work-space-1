package com.navyait.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navyait.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Serializable>{

	

	
	
}
