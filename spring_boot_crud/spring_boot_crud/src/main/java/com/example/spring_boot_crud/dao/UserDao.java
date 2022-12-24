package com.example.spring_boot_crud.dao;

import com.example.spring_boot_crud.model.User;


import java.util.List;

public interface UserDao {
    List<User> show();
    User index(int id);
    void save(User user);
    void update(int id, User updatedUser);
    void delete(int id);
}
