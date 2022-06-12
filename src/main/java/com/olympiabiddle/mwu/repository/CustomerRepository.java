package com.olympiabiddle.mwu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.olympiabiddle.mwu.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	@Query("Select c FROM Customer c WHERE c.email = ?1")
	public Customer findByEmail(String email);
}
