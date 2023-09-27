package com.finzly.bbc.customeritportal.BharatBijiliCorporation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Dao.TransactionDao;
import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.Transaction;

@Service
public class TransactionService {
	
	@Autowired
	private TransactionDao transactionDao;

	public List<Transaction> getAllTransaction() {
		return transactionDao.getAllTransaction();
	}

	public String getTransaction(Transaction transaction) {
		return transactionDao.getTransaction(transaction);
	}

}
