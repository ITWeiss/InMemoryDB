package com.example.inmemorydb.service;

import com.example.inmemorydb.entity.ProductEntity;
import com.example.inmemorydb.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Сервис для работы с продуктами {@link ProductEntity}
 *
 * @author ITWeiss
 */
@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<ProductEntity> getAllProducts() {
        return repository.findAll();
    }

    public ProductEntity createProduct(String name, double price) {
        ProductEntity product = new ProductEntity(null, name, price);
        return repository.save(product);
    }
}
