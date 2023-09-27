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

import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.Transaction;
import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Service.TransactionService;

@RestController
@CrossOrigin
@RequestMapping("bbc/")
public class TransactionController {
	
	@Autowired
	private TransactionService transactionservice;
	
	//Reference to retrieve all transaction details
	@GetMapping("alltransaction")
	public List<Transaction> getAllTransaction(){
		return transactionservice.getAllTransaction();
	}
	
	//To fetch the respective transaction details
		@PostMapping("transaction")
		public String getTransaction(@RequestBody Transaction transaction){
			return transactionservice.getTransaction(transaction);
		}

}
