package com.example.graphql.pagination.repository;

import com.example.graphql.pagination.entity.Session;
import com.example.graphql.pagination.entity.Speaker;
import org.springframework.data.repository.ListCrudRepository;

public interface SpeakerRepository extends ListCrudRepository<Speaker, Integer> {
}
