package com.finzly.bbc.customeritportal.BharatBijiliCorporation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Dao.InvoiceDao;
import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.Invoice;

@Service
public class InvoiceService {
	
	@Autowired
	private InvoiceDao invoiceDao;

	public List<Invoice> getAllInvoice() {
		return invoiceDao.getAllInvoice();
		
	}

	public List<Invoice> getInvoice(long customerId) {
		return invoiceDao.getInvoice(customerId);
	}
	
	public List<Invoice> getInvoicebyid(long invoiceId){
		return invoiceDao.getInvoicebyid(invoiceId);
	}

	public Invoice updateInvoice(long invoiceId) {
		List <Invoice> invoices=invoiceDao.getInvoicebyid(invoiceId);
		Invoice invoice=new Invoice();
		for(Invoice i:invoices) {
			invoice.setPaymentStatus("Paid");
			invoice.setAmountDue(i.getAmountDue());
			invoice.setCustomerId(i.getCustomerId());
			invoice.setDueDate(i.getDueDate());
			invoice.setInvoiceId(i.getInvoiceId());
			invoice.setUnitConsumed(i.getUnitConsumed());
			
			return invoice;
		}
		
		return null;
	
	
}

}
;
