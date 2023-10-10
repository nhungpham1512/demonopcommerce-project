package com.nhungtester.entity;

import com.nhungtester.tasks.Caculate;

public class Product {
    private String nameProduct;
    private int size;
    private String color;
    private int quantity;
    private double price;

    public String getNameProduct() {
        return nameProduct;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
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

    public Product(String nameProduct, int size, String color, int quantity, double price) {
        this.nameProduct = nameProduct;
        this.size = size;
        this.color = color;
        this.quantity = quantity;
        this.price = price;
    }

    public Product() {
            }

    public double getTotal() {
        return (quantity * price) + Caculate.giftWrappingFee();
    }

}
