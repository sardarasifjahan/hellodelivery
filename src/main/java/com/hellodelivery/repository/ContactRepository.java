package com.hellodelivery.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hellodelivery.pojo.Contact;

@Repository
public interface ContactRepository extends MongoRepository<Contact, Long> {

}
