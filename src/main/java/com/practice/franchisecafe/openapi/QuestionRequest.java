package com.practice.franchisecafe.openapi;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@NoArgsConstructor
public class QuestionRequest implements Serializable {
    @Setter
    private String question;
}