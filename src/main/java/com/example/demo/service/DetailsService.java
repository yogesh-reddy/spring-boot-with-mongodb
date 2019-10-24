package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.DetailsRepo;
import com.example.demomodel.Details;

@Service
public class DetailsService {
	
	@Autowired
	private DetailsRepo detailsrepo; 
	
	//Create
	public Details create( String name, Double creditLimit, Double creditAvailable, Double balance) {
		return detailsrepo.save(new Details(name,creditLimit,creditAvailable,balance));
	}

	public List<Details> getAll(){
		return detailsrepo.findAll();
	}
	public Details getByName(String name){
	return 	detailsrepo.findByName(name);
	}
	
	 public Details update(String name ,Double amnt) {
		 Details D = detailsrepo.findByName(name);
		 D.setBalance(D.getBalance()+amnt);
		 D.setCreditAvailable(D.getCreditAvailable()-amnt);
		 return detailsrepo.save(D);
	 }
		
	
}
