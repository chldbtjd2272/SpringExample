package com.example.mapper.service;

import com.example.mapper.domain.Product;
import com.example.mapper.domain.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product insertProduct(Product product){
        return productRepository.save(product);
    }

}
