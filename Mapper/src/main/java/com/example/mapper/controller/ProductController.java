package com.example.mapper.controller;

import com.example.mapper.domain.Product;
import com.example.mapper.domain.User;
import com.example.mapper.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("")
    public ResponseEntity<User> insert(@RequestBody Product product) {
        productService.insertProduct(product);
        return new ResponseEntity<>(new User(), HttpStatus.OK);
    }

}
