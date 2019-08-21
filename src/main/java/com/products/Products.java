package com.products;

public class Products {

	
	String ProductId;
	String ProductName;
	String ProductPrice;
	String ProductCategory;
	
	public Products(String productId, String productName, String productPrice,
			String productCategory, String prouctImage) {
		super();
		ProductId = productId;
		ProductName = productName;
		ProductPrice = productPrice;
		ProductCategory = productCategory;
		
	}

	public String getProductId() {
		return ProductId;
	}

	public void setProductId(String productId) {
		ProductId = productId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(String productPrice) {
		ProductPrice = productPrice;
	}

	public String getProductCategory() {
		return ProductCategory;
	}

	public void setProductCategory(String productCategory) {
		ProductCategory = productCategory;
	}

	@Override
	public String toString() {
		return "products [ProductId=" + ProductId + ", ProductName="
				+ ProductName + ", ProductPrice=" + ProductPrice
				+ ", ProductCategory=" + ProductCategory + "]";
	}
	
	
	
	
}
