package com.example.graphql.pagination.controller;

import com.example.graphql.pagination.entity.Event;
import com.example.graphql.pagination.entity.Speaker;
import com.example.graphql.pagination.repository.EventRepository;
import com.example.graphql.pagination.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class SpeakerController {

    @Autowired
    private SpeakerRepository speakerRepository;

    @QueryMapping
    public List<Speaker> speakers() {
        return speakerRepository.findAll();
    }

    @QueryMapping
    public Optional<Speaker> speaker(@Argument Integer id) {
        return speakerRepository.findById(id);
    }
}
