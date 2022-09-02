package com.springsecurity.auth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.auth.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	public Customer findByEmail(String email); 

}
