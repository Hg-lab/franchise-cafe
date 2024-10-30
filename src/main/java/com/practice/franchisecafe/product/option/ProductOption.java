package com.practice.franchisecafe.product.option;


import com.practice.franchisecafe.product.product.Product;
import jakarta.persistence.*;

import static jakarta.persistence.FetchType.*;
import static jakarta.persistence.GenerationType.AUTO;

@Entity
public class ProductOption {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "option_id")
    private Option option;
}
