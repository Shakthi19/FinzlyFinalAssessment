package com.finzly.bbc.customeritportal.BharatBijiliCorporation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Dao.PaymentDao;
import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.Payment;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentDao paymentDao;

	public List<Payment> getAllPayment() {
		return paymentDao.getAllPayment();
	}

	public List<Payment> getPayment(long customerId) {
		return paymentDao.getPayment(customerId);
	}

	public String payment(Payment payment) {
		return paymentDao.payment(payment);
	}

}
