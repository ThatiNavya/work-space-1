package com.navyait.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navyait.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
