package com.ts.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ts.model.Owner;


@Service
public class OwnerDao {

	
	@Autowired
	OwnerRepository ownerRepository;	
	
	
	public void register(Owner owner) {
		ownerRepository.save(owner);
	}	

	public Owner getOwnerDetails(String ownerEmailId,String password) {
		Owner owner = ownerRepository.findByOwnerEmailIdAndPassword(ownerEmailId,password);
		/*if((employee.getLoginId().equals(loginId)) && (employee.getPassword().equals(password))) {
			return employee;
		}*/
		return owner;
	}
}
