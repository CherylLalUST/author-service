package com.code.author_service.repo;

import com.code.author_service.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorRepo extends MongoRepository<Author,String> {
    Optional<Author> findByAuthorId(String authorId);
}
