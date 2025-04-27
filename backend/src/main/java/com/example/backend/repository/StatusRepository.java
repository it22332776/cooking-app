package com.example.backend.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.model.Status;

@Repository
public interface StatusRepository extends MongoRepository<Status, String> {

    List<Status> findByExpiredAtBefore(Date currentDate);
}
