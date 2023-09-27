package com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Payment {
	@Id
	private long paymentId;
	private double paymentAmount;
    private Date paymentDate;
    private String paymentMethod; 
    private long invoiceId;
    private long customerId;
    
    public Payment(){
    	
    }

	public Payment(long paymentId, double paymentAmount, Date paymentDate, String paymentMethod, long invoiceId,
			long customerId) {
		super();
		this.paymentId = paymentId;
		this.paymentAmount = paymentAmount;
		this.paymentDate = paymentDate;
		this.paymentMethod = paymentMethod;
		this.invoiceId = invoiceId;
		this.customerId = customerId;
	}

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
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

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentAmount=" + paymentAmount + ", paymentDate=" + paymentDate
				+ ", paymentMethod=" + paymentMethod + ", invoiceId=" + invoiceId + ", customerId=" + customerId + "]";
	}

}