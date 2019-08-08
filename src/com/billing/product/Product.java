package com.billing.product;


public class Product {

	private int id;
	private String name;
	private double price;
	private int stockQty;

	public int getId() {
		return id;
	}
	
	//Product constructor
	public Product(int i, String n, double p , int s) {

		id = i;
		name = n;
		price = p;
		stockQty =s;
	}

	//Display products
	void display() {
		System.out.println(id + " " + name + " " + price+" "+stockQty);
	}
	
	
	
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", price=" + price + ", stockQty=" + stockQty + "]";
	}

	void modifyQty(int qty) {
		this.stockQty=this.stockQty+qty;
	}
}
