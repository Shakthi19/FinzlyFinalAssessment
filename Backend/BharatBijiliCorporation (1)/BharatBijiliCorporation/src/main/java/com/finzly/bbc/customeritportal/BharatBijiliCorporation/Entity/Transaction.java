package com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transaction {
	@Id
	private long transactionId;
	private long customerId;
	private long invoiceId;
	private Date date;
	private double amount;
	private String paymentMethod;
	private String discount;
	
	Transaction(){
		
	}

	public Transaction(long transactionId, long customerId, long invoiceId, Date date, double amount,
			String paymentMethod, String discount) {
		super();
		this.transactionId = transactionId;
		this.customerId = customerId;
		this.invoiceId = invoiceId;
		this.date = date;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.discount = discount;
	}

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", customerId=" + customerId + ", invoiceId=" + invoiceId
				+ ", date=" + date + ", amount=" + amount + ", paymentMethod=" + paymentMethod + ", discount="
				+ discount + "]";
	}
	
}