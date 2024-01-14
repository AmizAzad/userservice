package com.service.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.service.user.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

}
