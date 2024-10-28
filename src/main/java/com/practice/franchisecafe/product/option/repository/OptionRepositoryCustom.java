package com.practice.franchisecafe.product.option.repository;

import com.practice.franchisecafe.product.option.Option;

import java.util.List;

public interface OptionRepositoryCustom {

    List<Option> findOptionsByProductId(Long productId);

}
