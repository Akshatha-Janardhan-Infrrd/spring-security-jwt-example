package com.test.jwt.api.service;

import com.test.jwt.api.entity.User;
import com.test.jwt.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    public void addUser(User user){
        repository.save(user);
    }
}
