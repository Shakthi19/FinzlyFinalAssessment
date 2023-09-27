package com.finzly.bbc.customeritportal.BharatBijiliCorporation.Dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.Customer;

@Repository
public class CustomerDao {

	@Autowired
	SessionFactory factory;

	public List<Customer> getAllCustomer() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Customer.class);
		return criteria.list();
	}
	
	public List<Customer> getcustomerId(long customerId) {
		Session session =factory.openSession();
		Criteria criteria=session.createCriteria(Customer.class);
		criteria.add(Restrictions.eq("customerId", customerId));
		return criteria.list();
		
	}

}