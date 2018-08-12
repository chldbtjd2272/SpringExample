package com.example.mapper.service;

import com.example.mapper.domain.UserProduct;
import com.example.mapper.domain.UserProductReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProductService {

    @Autowired
    private UserProductReository userProductReository;

    public UserProduct userProduct(UserProduct userProduct){
        return userProductReository.save(userProduct);
    }
}
