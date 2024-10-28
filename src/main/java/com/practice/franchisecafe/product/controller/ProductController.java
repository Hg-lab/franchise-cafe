package com.practice.franchisecafe.product.controller;

import com.practice.franchisecafe.product.dto.ProductOptionsResponse;
import com.practice.franchisecafe.product.dto.ProductResponse;
import com.practice.franchisecafe.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.*;

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

    @GetMapping(value = "/{productId}/options", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductOptionsResponse> getProductOptions(
            @PathVariable("productId") Long productId)
    {
        return ResponseEntity.ok().body(
                productService.getProductOptions(productId)
        );
    }
}
