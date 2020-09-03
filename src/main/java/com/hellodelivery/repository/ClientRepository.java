package com.hellodelivery.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hellodelivery.pojo.Client;

@Repository
public interface ClientRepository extends MongoRepository<Client, Long> {

}
