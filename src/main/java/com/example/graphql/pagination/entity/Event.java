package com.example.graphql.pagination.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Event {

    @Id
    private Integer id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate cfpStartDate;
    private LocalDate cfpEndDate;
    private String location;
    private String website;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "event")
    //@JoinColumn(name = "event_id"),
    private Set<Session> sessions = new HashSet<>();

    public Event() {

    }

    public Event(Integer id, String name, String description, LocalDate startDate, LocalDate endDate, LocalDate cfpStartDate, LocalDate cfpEndDate, String location, String website) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cfpStartDate = cfpStartDate;
        this.cfpEndDate = cfpEndDate;
        this.location = location;
        this.website = website;
    }

}
