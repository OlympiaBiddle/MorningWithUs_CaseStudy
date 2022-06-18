package com.olympiabiddle.mwu.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.olympiabiddle.mwu.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	
}
