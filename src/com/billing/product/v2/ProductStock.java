package com.billing.product.v2;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProductStock {

	Map<Product, List<Stock>> productstock = new HashMap<Product, List<Stock>>();

	
	public void addQty() {
		Product product1=new Product("P001","Soap",50);
	
		List<Stock> soapStock=new ArrayList<Stock>();
		
		
		
		Stock pr1Stock=new Stock(50.00,new Date());
		soapStock.add(pr1Stock);
		productstock.put(product1, soapStock);
		
		Stock pr1Stock2=new Stock(100.00,new Date());
		soapStock.add(pr1Stock2);
		productstock.put(product1, soapStock);
		
		
	}


	@Override
	public String toString() {
		return "ProductStock [productstock=" + productstock + "]";
	}

	
	
	
}
