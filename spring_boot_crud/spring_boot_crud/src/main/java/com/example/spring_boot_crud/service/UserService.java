package com.example.spring_boot_crud.service;


import com.example.spring_boot_crud.model.User;

import java.util.List;

public interface UserService {
    List<User> show();
    User index(int id);
    void save(User user);
    void update(int id, User updatedUser);
    void delete(int id);
}
