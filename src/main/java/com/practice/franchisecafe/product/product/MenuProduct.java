package com.practice.franchisecafe.product.product;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("MENU") // 구분 컬럼 값
@Getter
@NoArgsConstructor
public class MenuProduct extends Product {

}
