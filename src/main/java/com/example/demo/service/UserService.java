package com.example.demo.service;

import com.example.demo.model.UserModel;

public interface UserService {
    Iterable<UserModel> get();

    UserModel getById(Long id);

    void add(UserModel user);

    void update(Long id, UserModel user);

    void delete(Long id);
}
