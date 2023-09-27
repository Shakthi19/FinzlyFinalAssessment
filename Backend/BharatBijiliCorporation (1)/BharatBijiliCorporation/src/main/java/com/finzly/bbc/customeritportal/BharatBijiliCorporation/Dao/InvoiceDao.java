package com.finzly.bbc.customeritportal.BharatBijiliCorporation.Dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.Invoice;

@Repository
public class InvoiceDao {
	
	@Autowired
	SessionFactory factory;

	public List<Invoice> getAllInvoice() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Invoice.class);
		return criteria.list();
	}

	public List<Invoice> getInvoice(long customerId) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Invoice.class);
		criteria.add(Restrictions.eq("customerId", customerId));
		return criteria.list();
	}

	public List<Invoice> getInvoicebyid(long invoiceId) {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Invoice.class);
		criteria.add(Restrictions.eq("invoiceId", invoiceId));
		return criteria.list();
	}

}
