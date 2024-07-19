package com.example.Integration;

import java.io.Serializable;


public class Invoice implements Serializable {

    private static final long serialVersionUID = 1L;


    
    
    @Override
	public String toString() {
		return "SystemMessage [invoice_No=" + invoice_No + ", product_No=" + product_No + ", amount=" + amount
				+ ", seller_Id=" + seller_Id + "]";
	}
	private String invoice_No;
    public String getInvoice_No() {
		return invoice_No;
	}
	public void setInvoice_No(String invoice_No) {
		this.invoice_No = invoice_No;
	}
	public String getProduct_No() {
		return product_No;
	}
	public void setProduct_No(String product_No) {
		this.product_No = product_No;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getSeller_Id() {
		return seller_Id;
	}
	public void setSeller_Id(String seller_Id) {
		this.seller_Id = seller_Id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String product_No;
    private String amount;
    private String seller_Id;
    
    
    
    
    
    
    
    
    
    
    
    
    }

