package com.billing.model;

import java.util.ArrayList;
import java.util.List;

public class ProductStore {

	private List<Product> productStore = new ArrayList<Product>();

	public void addProductToStore(Product product) {
		productStore.add(product);
	}

	public void addProductToStore(int id, String name, double price, int stockQty) {
		Product newProduct = new Product(id, name, price,stockQty);
		productStore.add(newProduct);
	}

	public void viewProducts() {

		for (Product products : productStore) {
			products.display();
		}
	}

	public void increaseQty(int productId, int qty) {

			for (Product prd : productStore) {
				if(prd.getId()==productId) {
					prd.modifyQty(qty);
					
				}
			
			}				
	}

}
