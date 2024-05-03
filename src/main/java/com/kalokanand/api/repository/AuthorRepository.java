package com.kalokanand.api.repository;

import com.kalokanand.api.model.Author;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface AuthorRepository extends CrudRepository<Author, String> {
}
