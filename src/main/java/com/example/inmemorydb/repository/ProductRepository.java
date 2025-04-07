package com.example.inmemorydb.repository;

import com.example.inmemorydb.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Репозиторий для работы с таблицей продуктов
 *
 * @author ITWeiss
 */
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
