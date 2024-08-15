package com.AppDev.FinDoc.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.AppDev.FinDoc.entity.SpecialityCard;



@Repository
public interface SpecialityCardRepo extends MongoRepository<SpecialityCard,Integer> {
}