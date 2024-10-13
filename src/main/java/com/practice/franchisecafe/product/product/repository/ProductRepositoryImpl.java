package com.practice.franchisecafe.product.product.repository;

import com.practice.franchisecafe.product.product.Product;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;

import java.util.List;

import static com.practice.franchisecafe.product.product.QProduct.product;
import static com.practice.franchisecafe.product.product.QProductCategory.productCategory;

@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepositoryCustom{

    private final JPAQueryFactory queryFactory;

    @Override
    public List<Product> findAllByCategory(@Param("category_id") Long categoryId) {
        return queryFactory.selectFrom(product)
                .leftJoin(product.category, productCategory).fetchJoin()
                .where(categoryId != null ? product.category.id.eq(categoryId) : null)
                .fetch();
    }
}
