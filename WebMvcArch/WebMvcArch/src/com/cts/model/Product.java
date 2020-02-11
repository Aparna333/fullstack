package com.cts.model;

public class Product {
	private int prodId;
	private String prodName;
	private int quantity;
	private float price;
	public Product() {
		// TODO Auto-generated constructor stub
	}	
	public Product(int prodId, String prodName, int quantity, float price) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.quantity = quantity;
		this.price = price;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}

}
