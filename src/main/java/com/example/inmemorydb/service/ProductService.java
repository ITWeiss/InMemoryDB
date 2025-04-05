package com.example.inmemorydb.service;

import com.example.inmemorydb.entity.Product;
import com.example.inmemorydb.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product createProduct(String name, double price) {
        return repository.save(new Product(null, name, price));
    }
}
