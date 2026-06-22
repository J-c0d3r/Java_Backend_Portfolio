package com.jc0d3r.api_user_mongodb.infrastructure.repository;

import com.jc0d3r.api_user_mongodb.infrastructure.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserRepository extends MongoRepository<User, String> {

}
