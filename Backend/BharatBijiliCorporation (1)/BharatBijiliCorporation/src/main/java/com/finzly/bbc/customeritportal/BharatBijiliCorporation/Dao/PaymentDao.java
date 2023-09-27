package com.finzly.bbc.customeritportal.BharatBijiliCorporation.Dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.Payment;

@Repository
public class PaymentDao {
	
	@Autowired
	SessionFactory factory;

	public List<Payment> getAllPayment() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Payment.class);
		return criteria.list();
	}

	public List<Payment> getPayment(long customerId) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Payment.class);
		criteria.add(Restrictions.eq("customerId", customerId));
		return criteria.list();
	}

	public String payment(Payment payment) {
		Session session = factory.openSession();
		session.save(payment);
		session.beginTransaction().commit();
		return "Payment of "+ payment.getPaymentAmount()+" was successfull !";
	}

}
