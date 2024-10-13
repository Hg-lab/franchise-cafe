package com.practice.franchisecafe.store;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.*;

@Entity
@NoArgsConstructor
public class Store {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

}
