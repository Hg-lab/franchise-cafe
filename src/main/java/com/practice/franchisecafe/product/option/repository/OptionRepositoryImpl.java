package com.practice.franchisecafe.product.option.repository;

import com.practice.franchisecafe.product.option.Option;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import static com.practice.franchisecafe.option.QOption.option;
import static com.practice.franchisecafe.option.QProductOption.productOption;

@RequiredArgsConstructor
public class OptionRepositoryImpl implements OptionRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<Option> findOptionByProductId(Long productId) {

        return queryFactory.selectFrom(option)
                .join(productOption).on(option.id.eq(productOption.option.id))
                .where(productOption.product.id.eq(productId)).fetch();
    }

    @Modifying
    @Query("""
            DELETE FROM Option o
            WHERE o.product.id = :productId
            """)
    public void deleteByProductId(final Long productId) {

    }
}
