package com.hellodelivery.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("client")
@Data
public class Client {
	@Id
	private String client_id;
	private String org_name;
	private String name;
	private String email;
	private String phone;
	private String details;
	private String to_location;
	private String from_location;
	private String query;

}
