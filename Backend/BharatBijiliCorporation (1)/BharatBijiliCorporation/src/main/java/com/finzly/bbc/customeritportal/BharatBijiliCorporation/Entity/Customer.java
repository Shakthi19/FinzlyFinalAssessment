package com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity;

import javax.persistence.*;


@Entity
public class Customer {
	@Id
	private long customerId;
	private String name;
	private String otp;
	private double unitConsumed;
	private String billDueDate;
	private String email;
	
	Customer(){
		
	}

	public Customer(long customerId, String name, String otp, double unitConsumed, String billDueDate, String email) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.otp = otp;
		this.unitConsumed = unitConsumed;
		this.billDueDate = billDueDate;
		this.email = email;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public double getUnitConsumed() {
		return unitConsumed;
	}

	public void setUnitConsumed(double unitConsumed) {
		this.unitConsumed = unitConsumed;
	}

	public String getBillDueDate() {
		return billDueDate;
	}

	public void setBillDueDate(String billDueDate) {
		this.billDueDate = billDueDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", otp=" + otp + ", unitConsumed="
				+ unitConsumed + ", billDueDate=" + billDueDate + ", email=" + email + "]";
	}
	
	
}