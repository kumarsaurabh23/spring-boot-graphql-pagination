package com.example.graphql.pagination.repository;

import com.example.graphql.pagination.entity.Event;
import org.springframework.data.repository.ListCrudRepository;

public interface EventRepository extends ListCrudRepository<Event, Integer> {
}
