package com.cts.pms.model;

public class Product {
	
	private int prodId;
	private String prodName;
	private Integer quantity;
	private Double price;
	
	public Product() {
		System.out.println("I am product constructor");
	}

	public Product(Integer prodId, String prodName, Integer quantity, Double price) {
		
		this.prodId = prodId;
		this.prodName = prodName;
		this.quantity = quantity;
		this.price = price;
	}
	

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}
	
	
	
	

}
