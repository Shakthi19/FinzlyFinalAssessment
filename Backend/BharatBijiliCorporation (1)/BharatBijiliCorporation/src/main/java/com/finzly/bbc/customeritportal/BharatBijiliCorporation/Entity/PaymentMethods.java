package com.finzly.bbc.customeritportal.BharatBijiliCorporation.Entity;

import javax.persistence.*;

@Entity
public class PaymentMethods {
	@Id
    private String paymentMethod; 
    private long invoiceId;
    private long customerId;
    private double amountDue;
    
    public PaymentMethods(){
    	
    }

	public PaymentMethods(String paymentMethod, long invoiceId, long customerId, double amountDue) {
		super();
		this.paymentMethod = paymentMethod;
		this.invoiceId = invoiceId;
		this.customerId = customerId;
		this.amountDue = amountDue;
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

	public double getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}

	@Override
	public String toString() {
		return "PaymentMethods [paymentMethod=" + paymentMethod + ", invoiceId=" + invoiceId + ", customerId="
				+ customerId + ", amountDue=" + amountDue + "]";
	}
    
    

}
