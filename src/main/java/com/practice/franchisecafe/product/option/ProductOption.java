package com.practice.franchisecafe.product.option;


import com.practice.franchisecafe.product.product.Product;
import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
public class ProductOption {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "option_id")
    private Option option;
}
