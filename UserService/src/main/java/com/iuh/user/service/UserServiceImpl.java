package com.iuh.user.service;

import com.iuh.user.entity.User;
import com.iuh.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;


    @Override
    public List<User> findAllUser() {
        List<User> users = new ArrayList<>();
        users = userRepository.findAll();
        return users;
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }
}
