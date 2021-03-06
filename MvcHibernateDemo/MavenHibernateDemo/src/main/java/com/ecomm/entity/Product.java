package com.ecomm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product 
{
	@Id
	int productId;
	
	String productName;
	String productDesc;
	int price;
	
	public Product() {}
	
	public Product(int productId,String productName,String productDesc,int price) {
		this.productId=productId;
		this.productName=productName;
		this.productDesc=productDesc;
		this.price=price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
