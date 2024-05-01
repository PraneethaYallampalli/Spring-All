package com.mvn.DependencyInjection;

public class Order {
	 private int orderId;
	    private String orderName;
	    private Product product;

	   /* public Order(int orderId, String orderName, Product product) {
	        this.orderId = orderId;
	        this.orderName = orderName;
	        this.product = product;
	        
	    }*/
	    public void setOrderId(int orderId) {
	        this.orderId = orderId;
	    }
	    public int getOrderId() {
	        return orderId;
	    }
	    public void setOrderName(String orderName) {
	        this.orderName = orderName;
	    }

	    public String getOrderName() {
	        return orderName;
	    }
	    
	    public void setProduct(Product product) {
	        this.product = product;
	    }
	    public Product getProduct() {
	        return product;
	    }

	    public void display() {
	        System.out.println("Order ID: " + orderId);
	        System.out.println("Order Name: " + orderName);
	        System.out.println("Product Details:");
	        System.out.println("Product ID: " + product.getProductId());
	        System.out.println("Product Name: " + product.getProductName());
	        System.out.println("Product Price: " + product.getProductPrice());
	        System.out.println("Product Quantity: " + product.getProductQuantity());
	    }
   }
