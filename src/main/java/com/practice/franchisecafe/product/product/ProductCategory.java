package com.practice.franchisecafe.product.product;

import com.practice.franchisecafe.product.common.ProductBaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
public class ProductCategory extends ProductBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String displayName;

    private int depth;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "parent_id")
    private ProductCategory parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.DETACH, orphanRemoval = false)
    private List<ProductCategory> children = new ArrayList<>();
}
