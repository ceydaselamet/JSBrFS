package com.pair3.Odev.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "stock")
    private int stockAmount;

    public Product() {
    }

    public Product(String name, double price, int stockAmount) {
        this.name = name;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    public Product(int id, String name, double price, int stockAmount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}
