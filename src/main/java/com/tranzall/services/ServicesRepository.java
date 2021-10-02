package com.tranzall.services;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ServicesRepository extends MongoRepository<Customer, String> {

}
