package com.example.productservice.controller;

import com.example.productservice.enity.Product;
import com.example.productservice.enity.User;
import com.example.productservice.repository.OrderRepository;
import com.example.productservice.repository.ProductRepository;
import com.example.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v2")
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ProductRepository productRepository;


    @GetMapping("/product")
    public List<Product> findAllProduct() {
        List<Product> listProducts = new ArrayList<>();
        listProducts = productService.findAllProducts();
        return listProducts;
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product) {
        productService.addProducts(product);
        return product;
    }

    // Lấy thong tin người dùng và product
    @GetMapping("/orderproduct/{id}/{productId}")
    public ResponseEntity<OrderRepository> orderProductByUser(@PathVariable Integer id,
                                                              @PathVariable Integer productId) {
        OrderRepository orderRepository= new OrderRepository();
        String url = "http://localhost:8801/api/v2/user/" + id;
        ResponseEntity<User> response = restTemplate.getForEntity(url, User.class);
        Optional<Product> optional = productRepository.findById(productId);
        Product product = null;
        if (optional.isPresent()) {
            product = optional.get();
        } else {
            new RuntimeException("Khong co user theo id này");
        }
        User user = response.getBody();
        orderRepository.setUser(user);
        orderRepository.setProduct(product);
        return new ResponseEntity<>(orderRepository, HttpStatus.OK);
    }
}
