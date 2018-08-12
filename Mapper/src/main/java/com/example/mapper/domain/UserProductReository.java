package com.example.mapper.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProductReository extends JpaRepository<UserProduct,UserProductId> {
}
