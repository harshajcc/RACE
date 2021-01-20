package com.ts.race;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.dao.OwnerDao;
import com.ts.model.Owner;




@RestController
public class OwnerController {

	@Autowired
	OwnerDao ownerDao;
	
	
	@PostMapping("/registerOwner")			
	public void register(@RequestBody Owner owner){
		
		System.out.println("Owner Data Received From Angular");
		System.out.println(owner);//		
		ownerDao.register(owner);
	}
	
	@RequestMapping("/getOwner/{ownerEmailId}/{password}")
	public Owner getOwner(@PathVariable("ownerEmailId") String ownerEmailId, @PathVariable("password") String password){
		Owner owner = ownerDao.getOwnerDetails(ownerEmailId,password);
		return owner;		
	}
	
	
	
}
