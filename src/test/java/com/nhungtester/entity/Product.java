package com.nhungtester.entity;

public class Product {
    private String nameProduct;
    private int quantity;
    private double price;

    public String getNameProduct() {
        return nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Product(String nameProduct, int quantity, double price) {
        this.nameProduct = nameProduct;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotal() {
        return quantity * price;
    }
}
