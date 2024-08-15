package com.AppDev.FinDoc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.AppDev.FinDoc.entity.DoctorCard;


@Repository
public interface DoctorCardRepo extends MongoRepository<DoctorCard,Integer> {
}
