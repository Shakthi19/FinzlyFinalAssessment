package com.finzly.bbc.customeritportal.BharatBijiliCorporation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.Invoice;
import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.Payment;
import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.PaymentMethods;
import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Service.PaymentMethodsService;

@RestController
@CrossOrigin
@RequestMapping("bbc/")
public class PaymentMethodsController {
	@Autowired
	private PaymentMethodsService paymethodservice;

	//To fetch the respective paymentmethod by id
	@GetMapping("paymentmethodbyid")
	public List<PaymentMethods> getPayMethodbyid(@RequestParam("customerId")long customerId){
		return paymethodservice.getPayMethodbyid(customerId);
	}
		
	//To update payment
	@PostMapping("invoice/paymentmethod/{customerId}/{amountDue}")
    public String updateInvoice(@RequestBody PaymentMethods method) {
		return paymethodservice.updateInvoice(method);
    }
	
}
