package com.finzly.bbc.customeritportal.BharatBijiliCorporation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Dao.CustomerDao;
import com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public List<Customer> getAllCustomer() {
		return customerDao.getAllCustomer();
	}

	public String getLogin(Customer customer) {
		List<Customer> list=customerDao.getcustomerId(customer.getCustomerId());
		for(Customer c:list) {
			if(c.getCustomerId()==customer.getCustomerId()&&c.getOtp().equals(customer.getOtp())) {
				return "Login Successful!!!";
			}
		}
		return "Invalid Login";
	}

}