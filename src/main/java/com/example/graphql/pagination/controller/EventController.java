package com.example.graphql.pagination.controller;

import com.example.graphql.pagination.entity.Event;
import com.example.graphql.pagination.entity.Session;
import com.example.graphql.pagination.repository.EventRepository;
import com.example.graphql.pagination.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Limit;
import org.springframework.data.domain.ScrollPosition;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Window;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.graphql.data.query.ScrollSubrange;
import org.springframework.stereotype.Controller;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Controller
public class EventController {

    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private SessionRepository sessionRepository;

    @QueryMapping
    public List<Event> events() {
        return eventRepository.findAll();
    }

    @QueryMapping
    public Optional<Event> event(@Argument Integer id) {
        return eventRepository.findById(id);
    }

    @SchemaMapping
    public Window<Session> sessions(Event event, ScrollSubrange subrange) {
        ScrollPosition scrollPosition = subrange.position().orElse(ScrollPosition.offset());
        Limit limit = Limit.of(subrange.count().orElse(10));
        Sort sort = Sort.by("title").ascending();
        return sessionRepository.findByEventId(event.getId(), scrollPosition, limit, sort);
    }
}
