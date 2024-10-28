package com.practice.franchisecafe.product.product.controller;

import com.practice.franchisecafe.product.product.dto.ProductResponse;
import com.practice.franchisecafe.product.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductResponse>> getProducts(
            @RequestParam(name = "categoryId",required = false) Long categoryId
    ) {
        final List<ProductResponse> productResponses = productService.getAllProductsByCategory(categoryId);
        return ResponseEntity.ok().body(productResponses);
    }

    @GetMapping("/{productId}/options")
    public ResponseEntity<List<ProductResponse>> getProductOptions(
            @PathVariable Long productId)
    {
        final List<ProductResponse> productResponses = productService.getProductOptions(productId);
        return ResponseEntity.ok().body(productResponses);
    }
}
