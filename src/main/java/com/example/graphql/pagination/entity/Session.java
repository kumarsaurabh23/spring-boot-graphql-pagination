package com.example.graphql.pagination.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@NoArgsConstructor
public class Session {

    @Id
    private Integer id;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Enumerated(EnumType.STRING)
    private Level level;
    @ManyToMany
    @JoinTable(
            name = "session_tags",
            joinColumns = @JoinColumn(name = "tag_id"),
            inverseJoinColumns = @JoinColumn(name = "session_id"))
    private Set<Tag> tags;
    @ManyToOne
    private Event event;

    public Session(Integer id, String title, String description, Level level, Set<Tag> tags, Event event) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.level = level;
        this.tags = tags;
        this.event = event;
    }
}
