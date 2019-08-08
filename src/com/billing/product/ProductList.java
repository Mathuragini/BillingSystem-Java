package com.billing.product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductList {

	private List<Product> productList = new ArrayList<Product>();

	// Add new products --Using polymorphism

	// Method -01

	public void addProductToStore(Product product) {
		productList.add(product);
	}

	// Method -02

	public void addProductToStore(int id, String name, double price, int stockQty) {
		Product newProduct = new Product(id, name, price, stockQty);
		productList.add(newProduct);
	}

	// View existing products

	// Method -01 For loop
	public void viewProducts() {

		for (Product products : productList) {
			products.display();
		}
	}

	// Method -02 Iterator

	public void viewProductIt() {
		Iterator<Product> products = productList.iterator();

		while (products.hasNext()) {
			System.out.println(products.next());
		}

	}

	// Modify the products quantity
	public void increaseQty(int productId, int qty) {

		for (Product prd : productList) {
			if (prd.getId() == productId) {
				prd.modifyQty(qty);

			}

		}
	}

}
