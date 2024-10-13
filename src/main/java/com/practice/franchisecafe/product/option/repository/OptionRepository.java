package com.practice.franchisecafe.product.option.repository;

import com.practice.franchisecafe.product.option.Option;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OptionRepository extends JpaRepository<Option, Long>, OptionRepositoryCustom {

    @Override
    List<Option> findAll();
}
