package com.example.graphql.pagination.controller;

import com.example.graphql.pagination.entity.Event;
import com.example.graphql.pagination.entity.Session;
import com.example.graphql.pagination.repository.EventRepository;
import com.example.graphql.pagination.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class SessionController {

    @Autowired
    private SessionRepository sessionRepository;

    @QueryMapping
    public List<Session> sessions() {
        return sessionRepository.findAll();
    }

    @QueryMapping
    public Optional<Session> session(@Argument Integer id) {
        return sessionRepository.findById(id);
    }
}
