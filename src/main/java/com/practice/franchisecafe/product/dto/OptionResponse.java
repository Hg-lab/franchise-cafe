package com.practice.franchisecafe.product.dto;

import com.practice.franchisecafe.product.option.Option;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OptionResponse {
    private final Long optionId;
    private final String displayName;

    public static OptionResponse of(Option option) {
        return new OptionResponse(option.getId(), option.getDisplayName();
    }

}
