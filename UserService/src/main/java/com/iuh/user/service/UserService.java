package com.iuh.user.service;

import com.iuh.user.entity.User;

import java.util.List;

public interface UserService {
    public List<User> findAllUser();

    public void addUser(User user);
}
