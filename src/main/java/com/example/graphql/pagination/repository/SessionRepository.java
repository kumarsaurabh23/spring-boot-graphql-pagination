package com.example.graphql.pagination.repository;

import com.example.graphql.pagination.entity.Event;
import com.example.graphql.pagination.entity.Session;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Limit;
import org.springframework.data.domain.ScrollPosition;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Window;
import org.springframework.data.repository.ListCrudRepository;

public interface SessionRepository extends ListCrudRepository<Session, Integer> {

    Window<Session> findByEventId(Integer eventId, ScrollPosition position, Limit limit, Sort sort);
}
