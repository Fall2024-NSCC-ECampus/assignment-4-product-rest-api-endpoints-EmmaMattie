package com.example.restapiendpoints.Entities;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String address;

    @OneToMany
    @JoinColumn(name = "product_id")
    private List<Product> product;

    public Product getProduct() {
        return (Product) product;
    }

    public void setProduct(Product product) {
        this.product.clear();
        this.product.add(product);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
