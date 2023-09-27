package com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Invoice {
	@Id
	private long invoiceId;
	private long customerId;
	private double unitConsumed;
	private double amountDue;
	private Date dueDate;
	private String paymentStatus;
	
	public Invoice(){
		
	}

	public Invoice(long invoiceId, long customerId, double unitConsumed, double amountDue, Date dueDate,
			String paymentStatus) {
		super();
		this.invoiceId = invoiceId;
		this.customerId = customerId;
		this.unitConsumed = unitConsumed;
		this.amountDue = amountDue;
		this.dueDate = dueDate;
		this.paymentStatus = paymentStatus;
	}

	public long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public double getUnitConsumed() {
		return unitConsumed;
	}

	public void setUnitConsumed(double unitConsumed) {
		this.unitConsumed = unitConsumed;
	}

	public double getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", customerId=" + customerId + ", unitConsumed=" + unitConsumed
				+ ", amountDue=" + amountDue + ", dueDate=" + dueDate + ", paymentStatus=" + paymentStatus + "]";
	}

	
}