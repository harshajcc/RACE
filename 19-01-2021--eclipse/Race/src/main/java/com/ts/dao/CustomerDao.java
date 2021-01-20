package com.ts.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ts.model.Customer;





@Service
public class CustomerDao {

	@Autowired
	CustomerRepository customerRepository;	
	
	
	public void register(Customer customer) {
		customerRepository.save(customer);
	}	

	public Customer getCustomerDetails(String customerEmailId,String password) {
		Customer customer = customerRepository.findByCustomerEmailIdAndPassword(customerEmailId,password);
		/*if((employee.getLoginId().equals(loginId)) && (employee.getPassword().equals(password))) {
			return employee;
		}*/
		return customer;
	}
	
	

public Customer getCustomerById(String emailId) {
		Customer customer = customerRepository.findByCustomerEmailId(emailId);
		return customer;
	}
	
}
