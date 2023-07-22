package com.example.graphql.pagination.repository;

import com.example.graphql.pagination.entity.Session;
import com.example.graphql.pagination.entity.Tag;
import org.springframework.data.repository.ListCrudRepository;

public interface TagRepository extends ListCrudRepository<Tag, Integer> {
}
