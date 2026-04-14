package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Generates Getters, Setters, toString, equals, and hashCode
public class Product {
    private String name;
    private String price;
    public Product(String name, String price)
    {
        this.name = name;
        this.price = price;
    }
    // Getters and Setters...
}
