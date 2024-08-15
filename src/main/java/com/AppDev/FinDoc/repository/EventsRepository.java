package com.AppDev.FinDoc.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.AppDev.FinDoc.entity.EventsDetails;

@Repository
public interface EventsRepository extends MongoRepository<EventsDetails, Integer> {
}
