package com.practice.franchisecafe.product.product.repository;

import com.practice.franchisecafe.product.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>, ProductRepositoryCustom{

}
