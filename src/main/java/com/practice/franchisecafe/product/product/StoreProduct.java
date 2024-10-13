package com.practice.franchisecafe.product.product;

import com.practice.franchisecafe.store.Store;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Getter
@NoArgsConstructor
public class StoreProduct {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "store_id")
    private Store store;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    private int price;

    private boolean isSale;
}
