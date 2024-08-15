package com.AppDev.FinDoc.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.AppDev.FinDoc.entity.NewsDetails;

@Repository
public interface NewsDetailsRepository extends MongoRepository<NewsDetails, Integer> {
}
