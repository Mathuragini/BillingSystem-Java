package com.billing.product.v2;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProductStockEx {

	Map<Product, Stock> productstock = new HashMap<Product, Stock>();

	
	public void addQty() {
		Product product1=new Product("P001","Soap",50);
	
		
		
		
		Stock pr1Stock=new Stock(50.00,new Date());

		productstock.put(product1, pr1Stock);
		
		Stock pr1Stock2=new Stock(100.00,new Date());
	
		productstock.put(product1, pr1Stock2);
		
		
	}


	@Override
	public String toString() {
		return "ProductStock [productstock=" + productstock + "]";
	}

	
	
	
}
