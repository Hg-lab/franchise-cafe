package com.practice.franchisecafe.product.product;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("SET")
@Getter
@NoArgsConstructor
public class SetProduct extends Product {

    @OneToMany(mappedBy = "setProduct", cascade = CascadeType.ALL)
    private List<SetProductMenuProduct> menuProducts = new ArrayList<>();
}
