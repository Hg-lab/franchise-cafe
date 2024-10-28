package com.practice.franchisecafe.product.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class ProductOptionsResponse {
    private final Long productId;
    private final List<OptionResponse> options;

    public static ProductOptionsResponse of(Long productId, List<OptionResponse> options) {
        return new ProductOptionsResponse(productId, options);
    }
}
