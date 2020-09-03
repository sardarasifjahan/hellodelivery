package com.hellodelivery.pojo;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("contact")
@Data
public class Contact {
	@Id
	private String contactId;
	private String name;
	private String email;
	private String message;

}
