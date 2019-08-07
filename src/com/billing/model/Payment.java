package com.billing.model;

import java.util.ArrayList;

public class Payment {

	private int id;
	private  String type;
	private String price;
	
	Payment (int i , String t, String p){
		id =i;
		type =t;
		price =p;
		
	}
	
	void display() {
		System.out.println(id + " " + type + " "+price);
	}
	
	public static void main(String[] args) {
		Payment payment = new Payment(1, "type", "price1");
		Payment payment1 = new Payment(2, "type1", "price2");
			
		ArrayList<Payment> list=new ArrayList<Payment>();
	    list.add(payment);
	    list.add(payment1);
	    
	    
	    for (Payment payments: list) {
	    	payments.display();
	    }

	}

}
