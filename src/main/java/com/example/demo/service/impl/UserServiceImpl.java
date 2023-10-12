package com.example.demo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<UserModel> get() {
        return userRepository.findAll();
    }

    @Override
    public UserModel getById(Long id) {
        Optional<UserModel> user = userRepository.findById(id);
        return user.get();
    }

    @Override
    public void add(UserModel user) {
        userRepository.save(user);
    }

    @Override
    public void update(Long id, UserModel data) {
        Optional<UserModel> user = userRepository.findById(id);
        if(user.isPresent()) {
            userRepository.save(data);
        }
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
