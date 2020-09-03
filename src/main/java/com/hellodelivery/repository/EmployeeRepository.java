package com.hellodelivery.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hellodelivery.pojo.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {

}
