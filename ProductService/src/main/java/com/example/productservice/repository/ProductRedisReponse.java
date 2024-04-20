package com.example.productservice.repository;

import com.example.productservice.enity.Product;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRedisReponse {
    private HashOperations hashOperations;
    private RedisTemplate redisTemplate;

    public ProductRedisReponse(RedisTemplate redisTemplate) {
        this.hashOperations = redisTemplate.opsForHash();
        this.redisTemplate = redisTemplate;
    }
    public void saveStudent(Product product) {
        hashOperations.put("PRODUCT", product.getId(), product);
    }

}
