package com.iuh.user.controller;

import com.iuh.user.entity.User;
import com.iuh.user.repository.UserRepository;
import com.iuh.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;
    @GetMapping("/user")
    public List<User> getAllUser(){
        List<User> listUser = new ArrayList<>();
        listUser = userService.findAllUser();
        return listUser;
    }
    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        userService.addUser(user);
        return user;
    }
    @GetMapping("/user/{id}")
    public User findByIdUser(@PathVariable Integer id){
        Optional<User>optional = userRepository.findById(id);
        User user = null;
        if (optional.isPresent()){
            user = optional.get();
        }else {
            new RuntimeException("Không có User theo Id này");
        }
        return user;
    }
}
