package com.billing.model;

public class ProductTest {

	public static void main(String[] args) {
		
		ProductStore productStore = new ProductStore();
		
		productStore.addProductToStore(1, "nokia", 5000);
		productStore.addProductToStore(2, "samsung", 25000);
		
		Product product = new Product(2, "name", 600);
		productStore.addProductToStore(product);
		
		productStore.viewProducts();
	}

}
