package com.billing.product;

public class TestProduct {

	public static void main(String[] args) {

		ProductList productList = new ProductList();

		// Adding products

		// Method -01
		Product product = new Product(1, "iphone", 60000, 15);
		productList.addProductToStore(product);

		// Method -02
		productList.addProductToStore(1, "nokia", 5000, 10);
		productList.addProductToStore(3, "samsung", 25000, 10);

		// Modify Quantity
		// Increase Quantity
		productList.increaseQty(1, 10);

		// Decrease Quantity
		productList.increaseQty(1, -5);

		// View Products
		// Method -01
		productList.viewProducts();

		// Method -02
		productList.viewProductIt();

	}

}
