package com.billing.model;

public class PurchaseGoods {

	private int id;
	private String name;
	private double price;

	public PurchaseGoods(int i, String n, double p) {
		id = i;
		name = n;
		price = p;
	}

	void display() {
		System.out.print(id + " " + name + " " + price);
	}

	void modifyAmount(double amount) {

		this.price = this.price + amount;
	}
}
