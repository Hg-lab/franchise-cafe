package com.practice.franchisecafe.product.dto;

import com.practice.franchisecafe.product.product.Product;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ProductResponse {

        private final Long id;
        private final String name;
        private final String displayName;
        private final String description;
        private final int defaultPrice;

        public static ProductResponse of(Product product) {
            return new ProductResponse(
                    product.getId(),
                    product.getName(),
                    product.getDisplayName(),
                    product.getDescription(),
                    product.getDefaultPrice()
            );
        }
}
