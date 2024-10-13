package com.practice.franchisecafe.product.product.repository;

import com.practice.franchisecafe.product.product.Product;

import java.util.List;

public interface ProductRepositoryCustom {
    List<Product> findAllByCategory(Long category);

}
