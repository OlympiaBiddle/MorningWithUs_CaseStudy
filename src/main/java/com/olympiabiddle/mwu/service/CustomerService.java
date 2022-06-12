package com.olympiabiddle.mwu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olympiabiddle.mwu.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired private CustomerRepository customerRepo;
	

}
