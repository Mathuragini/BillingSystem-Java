package com.billing.product.v2;


public class Product {

	private String id;
	private String name;
	private double price;
	

	public String getId() {
		return id;
	}
	
	//Product constructor
	public Product(String i, String n, double p) {

		this.id = i;
		this.name = n;
		this.price = p;
	}

	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}


}
