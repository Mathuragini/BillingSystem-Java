package com.billing.model;

public class Product {

	private int id;
	private String name;
	private double price;

	public Product(int i, String n, double p) {

		id = i;
		name = n;
		price = p;
	}

	void display() {
		System.out.println(id + " " + name + " " + price);
	}
}
