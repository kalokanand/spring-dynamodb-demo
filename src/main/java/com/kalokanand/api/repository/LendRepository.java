package com.kalokanand.api.repository;

import com.kalokanand.api.model.Book;
import com.kalokanand.api.model.Lend;
import com.kalokanand.api.model.LendStatus;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
@EnableScan
public interface LendRepository extends CrudRepository<Lend, String> {
    Optional<Lend> findByBookIdAndStatus(String bookId, LendStatus status);
}
