package com.credwise.task.Details.Repository;

import com.credwise.task.Details.model.Details;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface DetailsRepository extends MongoRepository<Details, String> {
    @Query("{'Id': ?0}")
    Optional<Details> findById(String Id);
}
