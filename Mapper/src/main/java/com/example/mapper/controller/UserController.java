package com.example.mapper.controller;


import com.example.mapper.domain.Product;
import com.example.mapper.domain.User;
import com.example.mapper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    public ResponseEntity<String> insert(@RequestBody User user){
        userService.insertUser(user);
        return new ResponseEntity<>("success",HttpStatus.OK);
    }
}
