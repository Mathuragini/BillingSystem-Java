package com.billing.model;

import java.util.ArrayList;
import java.util.List;

public class ProductStore {
	
	private List<Product> productStore=new ArrayList<Product>();

	public void addProductToStore(Product product) {
		productStore.add(product);
	}
	
	public void addProductToStore(int id,String name,double price) {
		Product newProduct=new Product(id,name,price);
		productStore.add(newProduct);
	}	

    
    public void viewProducts() {
    	
    	for (Product products: productStore) {
        	products.display();
        }
    }
    
    public int increaseQty(int qty) {
    	
		return 0;
    	
    }
    
}
