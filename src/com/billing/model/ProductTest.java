package com.billing.model;

public class ProductTest {

	public static void main(String[] args) {
		
		ProductStore productStore = new ProductStore();
		
		productStore.addProductToStore(1, "nokia", 5000,10);
		productStore.addProductToStore(2, "samsung", 25000,10);
		
//		Product product = new Product(2, "name", 600);
//		productStore.addProductToStore(product);
		
		//productStore.viewProducts();
		
		productStore.increaseQty(1, 10);
		productStore.increaseQty(1, -5);
		
		productStore.viewProducts();
	}

}
