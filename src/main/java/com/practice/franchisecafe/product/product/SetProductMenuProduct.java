package com.practice.franchisecafe.product.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class SetProductMenuProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "set_product_id")
    private SetProduct setProduct;

    @ManyToOne
    @JoinColumn(name = "menu_product_id")
    private MenuProduct menuProduct;

}
