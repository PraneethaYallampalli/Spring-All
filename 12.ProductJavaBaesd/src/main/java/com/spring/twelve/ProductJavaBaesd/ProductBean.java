package com.spring.twelve.ProductJavaBaesd;

public class ProductBean {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public ProductBean() {

    }

    public ProductBean(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void print() {
        double total = price * quantity;
        System.out.println("Total: " + total);
        double discount = 0.0;
        if (total < 1000) {
            discount = (total * 10) / 100;
        } else if (total >= 1000 && total < 3000) {
            discount = (total * 15) / 100;
        } else {
            discount = (total * 20) / 100;
            System.out.println("Discount: " + discount);
        }
        
       double invoice = total - discount;
        System.out.println("Invoice:: " + invoice);
    }
}
