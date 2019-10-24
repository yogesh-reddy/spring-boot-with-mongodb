package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demomodel.Details;

@Repository
public interface DetailsRepo extends MongoRepository<Details,String> {
 public Details findByName(String name);
}
