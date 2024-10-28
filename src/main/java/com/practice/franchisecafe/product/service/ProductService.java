package com.practice.franchisecafe.product.service;

import com.practice.franchisecafe.product.dto.OptionResponse;
import com.practice.franchisecafe.product.dto.ProductOptionsResponse;
import com.practice.franchisecafe.product.dto.ProductResponse;
import com.practice.franchisecafe.product.option.repository.OptionRepository;
import com.practice.franchisecafe.product.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final OptionRepository optionRepository;

    public List<ProductResponse> getAllProductsByCategory(Long categoryId) {
        return productRepository.findAllByCategory(categoryId).stream()
                .map(ProductResponse::of)
                .toList();
    }

    public ProductOptionsResponse getProductOptions(Long productId) {
        return ProductOptionsResponse.of(
                productId,
                optionRepository
                        .findOptionsByProductId(productId)
                        .stream()
                        .map(OptionResponse::of)
                        .toList()
        );
    }
}
