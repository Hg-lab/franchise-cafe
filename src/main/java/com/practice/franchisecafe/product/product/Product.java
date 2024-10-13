package com.practice.franchisecafe.product.product;

import com.practice.franchisecafe.product.common.ProductBaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.FetchType.*;
import static jakarta.persistence.GenerationType.*;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "product_type")
@Getter
@NoArgsConstructor(access = PROTECTED)
public abstract class Product extends ProductBaseEntity {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String name;

    private String displayName;

    private String description;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "category_id")
    private ProductCategory category;

    private int defaultPrice;

    private boolean isSeasonal = false;

    private boolean isRecommended = false;

    public void setUnusable() {
        this.isUsable = false;
    }

    public void delete() {
        this.isDeleted = true;
    }
}
