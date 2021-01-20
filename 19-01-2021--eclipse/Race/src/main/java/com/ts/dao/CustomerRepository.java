package com.ts.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ts.model.Customer;



public interface CustomerRepository extends JpaRepository<Customer,Integer> {

	Customer findByCustomerEmailIdAndPassword(String customerEmailId,String password);
	
	Customer findByCustomerEmailId(String CustomerEmailId);
}
