package com.AppDev.FinDoc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.AppDev.FinDoc.entity.HospitalDetails;

@Repository
public interface HospitalDetailRepo extends MongoRepository<HospitalDetails,String>{

}
