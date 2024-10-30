package com.practice.franchisecafe.product.option;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.AUTO;

@Entity
public class ProductOptionItem {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @ManyToOne(fetch = LAZY)
    private ProductOption productOption;

    @Embedded
    private OptionItem optionItem;
}
