package com.AppDev.FinDoc.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.AppDev.FinDoc.entity.HospitalCard;


@Repository
public interface HospitalCardRepo extends MongoRepository<HospitalCard,Integer> {
}
