package com.example.productservice.service;

import com.example.productservice.enity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAllProducts();
    public void addProducts(Product product);
}
