package com.finzly.bbc.customeritportal.BharatBijiliCorporation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.Customer;
import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Service.CustomerService;

@RestController
@CrossOrigin
@RequestMapping("bbc/")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	//Reference to retrieve all customer details
	@GetMapping("customerbyid")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
	//To validate customer login
	@PostMapping("login")
	public String getLogin(@RequestBody Customer customer) {
		return customerService.getLogin(customer);
		
	}

}