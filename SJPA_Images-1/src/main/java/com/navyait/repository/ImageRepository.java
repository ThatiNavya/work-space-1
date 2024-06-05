package com.navyait.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navyait.entity.User;

public interface ImageRepository extends JpaRepository<User, Integer> {

}
