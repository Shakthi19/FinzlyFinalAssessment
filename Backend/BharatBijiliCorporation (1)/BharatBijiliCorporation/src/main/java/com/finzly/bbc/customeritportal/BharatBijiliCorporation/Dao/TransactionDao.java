package com.finzly.bbc.customeritportal.BharatBijiliCorporation.Dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.Transaction;

@Repository
public class TransactionDao {
	
	@Autowired
	SessionFactory factory;

	public List<Transaction> getAllTransaction() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Transaction.class);
		return criteria.list();
	}

	public String getTransaction(Transaction transaction) {
		Session session = factory.openSession();
		session.save(transaction);
		session.beginTransaction().commit();
		return "Transaction added successfully !";
	}

}
