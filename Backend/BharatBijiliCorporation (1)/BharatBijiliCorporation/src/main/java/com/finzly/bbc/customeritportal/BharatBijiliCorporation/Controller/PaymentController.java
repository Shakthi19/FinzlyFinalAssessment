package com.finzly.bbc.customeritportal.BharatBijiliCorporation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.Payment;
import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Service.PaymentService;


@RestController
@CrossOrigin
@RequestMapping("bbc/")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentservice;
	
	//Reference to retrieve all payment details
	@GetMapping("allpayment")
	public List<Payment> getAllPayment(){
		return paymentservice.getAllPayment();
	}
	
	//To fetch the respective payment
	@GetMapping("getpayment")
	public List<Payment> getPayment(@RequestParam("customerId") long customerId){
		return paymentservice.getPayment(customerId);
	}
	
	//To save the payment
	@PostMapping("payment")
	public String payment(@RequestBody Payment payment) {
		return paymentservice.payment(payment);
	}
}