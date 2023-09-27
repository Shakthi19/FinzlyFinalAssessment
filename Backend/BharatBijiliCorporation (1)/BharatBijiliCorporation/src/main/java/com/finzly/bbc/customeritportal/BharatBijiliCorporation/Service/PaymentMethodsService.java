package com.finzly.bbc.customeritportal.BharatBijiliCorporation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Dao.PaymentMethodsDao;
import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.Invoice;
import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.Payment;
import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.PaymentMethods;
@Service
public class PaymentMethodsService {
	
	@Autowired
	private PaymentMethodsDao paymethodDao;

	public List<PaymentMethods> getPayMethodbyid(long customerId) {
		return paymethodDao.getPayMethodbyid(customerId);
	}

	public String updateInvoice(PaymentMethods method) {
		return paymethodDao.updateInvoice(method);
	}

}
