package com.example.productservice.repository;

import com.example.productservice.enity.Product;
import com.example.productservice.enity.User;

public class OrderRepository {
    private Product product;
    private User user;

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
