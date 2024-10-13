package com.practice.franchisecafe.product.option;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.*;

@Entity
public class OptionItem {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String name;

    private String displayName;

    private int addPrice;

    private boolean isDefault;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "option_id")
    private Option option;
}
