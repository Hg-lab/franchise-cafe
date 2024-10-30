package com.practice.franchisecafe.product.option;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.*;

@Embeddable
public class OptionItem {

    private String name;

    private String displayName;

    private int addPrice;

    private boolean isDefault;

}
