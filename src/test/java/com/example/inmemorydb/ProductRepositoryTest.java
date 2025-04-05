package com.example.inmemorydb;

import com.example.inmemorydb.entity.Product;
import com.example.inmemorydb.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository repository;

    @Test
    public void testProductSaveAndRetrieve() {
        Product product = new Product(null,"Product1", 10.0);

        repository.save(product);
        assertThat(repository.findAll()).hasSize(1);
    }

}
