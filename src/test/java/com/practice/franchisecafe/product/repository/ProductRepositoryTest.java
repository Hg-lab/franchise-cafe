package com.practice.franchisecafe.product.repository;

import com.practice.franchisecafe.product.product.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@Slf4j
@DataJpaTest
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @BeforeEach
    void init() {
//        Product menuProduct = new MenuProduct();
//        productRepository.save(menuProduct);
    }

    @Test
    void test() {
//        List<Product> all = productRepository.findAll();
//        log.info("size = {}", all.size());
//        Assertions.assertThat(all).isEmpty();
    }
}