package com.billing.product.v2;

import java.util.Date;

public class Stock {
	private Double quantity;
	private Date dateModified;
	
	public Stock(Double quantity, Date dateModified) {
		super();
		this.quantity = quantity;
		this.dateModified = dateModified;
	}

	@Override
	public String toString() {
		return "Stock [quantity=" + quantity + ", dateModified=" + dateModified + "]";
	}
	
	
}
