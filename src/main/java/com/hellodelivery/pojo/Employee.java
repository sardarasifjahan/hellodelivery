package com.hellodelivery.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("employee")
@Data
public class Employee {
	@Id
	private String employee_id;
	private String name;
	private String email;
	private String phone;
	private String dl_number;
	private String adhaar_number;
	private String pan_number;
	private String gender;
	private String vehicle;
	private String vehicle_rc_number;

}
