package com.iuh.user.repository;

import com.iuh.user.entity.User;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRedisReponse {
    private HashOperations hashOperations;
    private RedisTemplate redisTemplate;

    public UserRedisReponse(RedisTemplate redisTemplate) {
        this.hashOperations = redisTemplate.opsForHash();
        this.redisTemplate = redisTemplate;
    }
    public void saveUser(User user){
        hashOperations.put("USER", user.getId(), user);
    }
}
