package com.practice.franchisecafe.product.common;

import com.practice.franchisecafe.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@MappedSuperclass
public abstract class ProductBaseEntity extends BaseEntity {

    @ColumnDefault("false")
    public boolean isDeleted = false;

    @ColumnDefault("false")
    public boolean isUsable = false;

}


