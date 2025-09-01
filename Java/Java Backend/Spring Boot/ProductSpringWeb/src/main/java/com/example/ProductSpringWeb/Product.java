package com.example.ProductSpringWeb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String type;
    private String place;
    private int warrenty;

    public Product() {
    }

    public Product(String name, String type, String place, int warrenty) {
        this.name = name;
        this.type = type;
        this.place = place;
        this.warrenty = warrenty;
    }
}
