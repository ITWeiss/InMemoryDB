package com.example.inmemorydb.repository;

import com.example.inmemorydb.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
