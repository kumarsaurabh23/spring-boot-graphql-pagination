package com.example.graphql.pagination.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Speaker {

    @Id
    private Integer id;
    private String name;
    private String title;
    private String company;
    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private Gender gender;
    private String country;
    private String email;
    private String phoneNumber;
    private String twitter;

    public Speaker() {

    }

    public Speaker(
            Integer id,
            String name,
            String title,
            String company,
            Gender gender,
            String country,
            String email,
            String phoneNumber,
            String twitter
    ) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.company = company;
        this.gender = gender;
        this.country = country;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.twitter = twitter;
    }
}
