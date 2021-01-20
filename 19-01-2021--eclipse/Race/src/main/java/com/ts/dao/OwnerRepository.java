package com.ts.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ts.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner,Integer> {

	
	Owner findByOwnerEmailIdAndPassword(String ownerEmailId,String password);
}
