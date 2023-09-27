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
import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Service.InvoiceService;


@RestController
@CrossOrigin
@RequestMapping("bbc/")
public class InvoiceController {
	
	@Autowired
	private InvoiceService invoiceService;
	
	//Reference to retrieve all invoice details
	@GetMapping("allinvoice")
	public List<Invoice> getAllInvoice(){
		return invoiceService.getAllInvoice();
	}
	
	//To fetch the respective invoice by customerid
	@GetMapping("invoice")
	public List<Invoice> getInvoice(@RequestParam("customerId") long customerId){
		return invoiceService.getInvoice(customerId);
	}
	
	//To fetch the respective invoice by invoiceid
		@GetMapping("invoicebyid")
		public List<Invoice> getInvoicebyid(@RequestParam("invoiceId")long invoiceId){
			return invoiceService.getInvoicebyid(invoiceId);
		}
	
	//To update status of invoice
	@PutMapping("/updateInvoice")
    public Invoice updateInvoice(@RequestParam("invoiceId")long invoiceId) {
		return invoiceService.updateInvoice(invoiceId);
    }

}
