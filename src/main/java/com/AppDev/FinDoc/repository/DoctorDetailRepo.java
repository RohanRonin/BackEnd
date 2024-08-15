package com.AppDev.FinDoc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.AppDev.FinDoc.entity.DoctorDetails;


@Repository
public interface DoctorDetailRepo extends MongoRepository<DoctorDetails,Integer> {

}
