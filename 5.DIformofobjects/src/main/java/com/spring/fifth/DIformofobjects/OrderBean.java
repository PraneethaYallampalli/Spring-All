package com.spring.fifth.DIformofobjects;

public class OrderBean {
	private int orderid;
	private ProductBean product;
	public OrderBean() {
		super();
	}
	public OrderBean(int orderid, ProductBean product) {
		super();
		this.orderid=orderid;
		this.product=product;
	}
	public void setOrderid(int orderid) {
		this.orderid=orderid;
	}
	public int getOrderid() {
		return this.orderid=orderid;
	}
	public void setProduct(ProductBean product) {
		this.product=product;
	}
	public ProductBean getproduct() {
		return this.product=product;
	}
	public void print() {
		System.out.println("\n Order Details: ");
		System.out.println("Order Id: "+orderid);
		System.out.println("\n Product Details: ");
		System.out.println("Product Id: "+product.getProductid());
		System.out.println("Product Name: "+product.getProductname());
		System.out.println("Product Price: "+product.getProductprice());
		System.out.println("Product Quantity: "+product.getProductquantity());
	}
}