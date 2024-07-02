
package com.example.memorygame.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.memorygame.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}

