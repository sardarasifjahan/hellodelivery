package com.hellodelivery.controller;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hellodelivery.pojo.Client;
import com.hellodelivery.pojo.Contact;
import com.hellodelivery.pojo.Employee;
import com.hellodelivery.repository.ClientRepository;
import com.hellodelivery.repository.ContactRepository;
import com.hellodelivery.repository.EmployeeRepository;

@RestController
@RequestMapping("/hello")
public class HelloDeliveryController {
	@Autowired
    private JavaMailSender sender;
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private ContactRepository contactRepository;
	@Autowired
	private EmployeeRepository employeeRepository;

	@PostMapping("/client")
	public Client addBookingShow(@RequestBody Client client) {
		return clientRepository.save(client);
	}

	@PostMapping("/contact")
	public Contact addBookingShow(@RequestBody Contact contact) {
		Contact contacts=contactRepository.save(contact);
		try {
			home(contacts);
		} catch (Exception e) {
			e.getMessage();
		}
		return contacts;
	}

	@PostMapping("/employee")
	public Employee addBookingShow(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	  public  String home(Contact contact) {
	        try {
	            sendEmail("amd557139@gmail.com",contact);
	            System.out.print("DONE");
	            return "Email Sent!   Senddd";
	        }catch(Exception ex) {
	            return "Error in sending email: "+ex;
	        }
	    }
	 
	    private void sendEmail(String email,Contact contact) throws Exception{
	        MimeMessage message = sender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(message);
	         
	        helper.setTo(email);
	        helper.setText("welcome to the data \n "+"\n"+"Name :-"+contact.getName() +" Email :-"+contact.getEmail() +" Message :-"+contact.getMessage());
	        helper.setSubject("Booking Status"); 
	        sender.send(message);
	    }

}
