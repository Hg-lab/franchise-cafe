package com.practice.franchisecafe.common;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @CreatedDate
    @Column(nullable = false, updatable = false)
    @ColumnDefault("CURRENT_TIMESTAMP(6)")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    @ColumnDefault("CURRENT_TIMESTAMP(6)")
    private LocalDateTime modifiedAt;
}
