package com.ts.race;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.dao.CustomerDao;
import com.ts.model.Customer;

@RestController
public class CustomerController {

	
	@Autowired
	CustomerDao customerDao;
	
	
	@PostMapping("/registerCustomer")			
	public void register(@RequestBody Customer customer){
		
		System.out.println("Customer Data Received From Angular");
		System.out.println(customer);//		
		customerDao.register(customer);
	}
	
	@RequestMapping("/getCustomer/{customerEmailId}/{password}")
	public Customer getCustomer(@PathVariable("customerEmailId") String customerEmailId, @PathVariable("password") String password){
		Customer customer = customerDao.getCustomerDetails(customerEmailId,password);
		return customer;		
	}
	
	@RequestMapping("/customerProfile/{emailId}")
	public Customer getCustomerById(@PathVariable("emailId") String emailId){
		Customer customer = customerDao.getCustomerById(emailId);
		return customer;		
	}
	
	
	
}
