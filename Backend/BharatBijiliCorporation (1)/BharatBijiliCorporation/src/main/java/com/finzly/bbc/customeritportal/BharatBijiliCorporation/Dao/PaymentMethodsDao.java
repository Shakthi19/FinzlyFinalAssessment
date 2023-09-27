package com.finzly.bbc.customeritportal.BharatBijiliCorporation.Dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.Invoice;
import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.Payment;
import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.PaymentMethods;

@Repository
public class PaymentMethodsDao {
	
	@Autowired
	SessionFactory factory;

	public List<PaymentMethods> getPayMethodbyid(long customerId) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(PaymentMethods.class);
		criteria.add(Restrictions.eq("customerId", customerId));
		return criteria.list();
	}

	public String updateInvoice(PaymentMethods method) {
		Session session = factory.openSession();
		session.save(method);
		session.beginTransaction().commit();
		return "Payment method added successfully !";
	}

}
