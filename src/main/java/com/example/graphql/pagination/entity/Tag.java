package com.example.graphql.pagination.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Tag {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    public Tag(String name) {
        this.name = name;
    }
}
