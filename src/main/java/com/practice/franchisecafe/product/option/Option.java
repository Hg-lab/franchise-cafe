package com.practice.franchisecafe.product.option;

import com.practice.franchisecafe.common.BaseEntity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Table(name = "options")
public class Option extends BaseEntity {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String name;

    private String displayName;

    private boolean isRequired;

    private boolean isMultipleChoice;

    @OneToMany(mappedBy = "option")
    private List<OptionItem> optionItems = new ArrayList<>();
}
