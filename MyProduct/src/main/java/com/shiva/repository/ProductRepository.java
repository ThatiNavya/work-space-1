package com.shiva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiva.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
