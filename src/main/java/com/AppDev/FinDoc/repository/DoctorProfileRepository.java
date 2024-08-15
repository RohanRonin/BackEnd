package com.AppDev.FinDoc.repository;

import com.AppDev.FinDoc.entity.DoctorProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DoctorProfileRepository extends MongoRepository<DoctorProfile, String> {
}
