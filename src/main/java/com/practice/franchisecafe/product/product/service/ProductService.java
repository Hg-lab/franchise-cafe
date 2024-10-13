package com.practice.franchisecafe.product.product.service;

import com.practice.franchisecafe.product.product.dto.ProductResponse;
import com.practice.franchisecafe.product.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll().stream()
                .map(ProductResponse::of)
                .toList();
    }

    public List<ProductResponse> getAllProductsByCategory(Long categoryId) {
        return productRepository.findAllByCategory(categoryId).stream()
                .map(ProductResponse::of)
                .toList();
    }
}
