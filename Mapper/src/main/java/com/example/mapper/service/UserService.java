package com.example.mapper.service;

import com.example.mapper.domain.User;
import com.example.mapper.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User insertUser(User user){
        return userRepository.save(user);
    }

}
