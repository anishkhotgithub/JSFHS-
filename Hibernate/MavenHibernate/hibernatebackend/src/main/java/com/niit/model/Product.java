package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int productid;
	@Column
	String productname;
	float price;
	
	
	public Product(int productid, String productname, float price) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.price = price;
	}
	
	
	
	public Product(String productname, float price) {
		super();
		this.productname = productname;
		this.price = price;
	}



	public Product() {
		super();
	}

	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}
