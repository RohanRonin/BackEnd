package com.AppDev.FinDoc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.AppDev.FinDoc.dto.AuthenticationDTO;
import com.AppDev.FinDoc.entity.User;


public interface UserRepository extends MongoRepository<User,String> {

    User findByEmail(String username);

	AuthenticationDTO save(AuthenticationDTO auth);
}
