package com.billing.model;

public class Product {

	private int id;
	private String name;
	private double price;
	private int stockQty;

	public int getId() {
		return id;
	}

	public Product(int i, String n, double p , int s) {

		id = i;
		name = n;
		price = p;
		stockQty =s;
	}

	void display() {
		System.out.println(id + " " + name + " " + price+" "+stockQty);
	}
	
//	void addQty(int qty) {
//		this.stockQty=this.stockQty+qty;
//	}
	
	void modifyQty(int qty) {
		this.stockQty=this.stockQty+qty;
	}
}
