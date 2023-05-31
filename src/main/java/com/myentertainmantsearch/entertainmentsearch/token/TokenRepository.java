package com.myentertainmantsearch.entertainmentsearch.token;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface TokenRepository extends MongoRepository<Token, String>{
  @Query("{'user._id': ?0, $or: [{'expired': false}, {'revoked': false}]}")
    List<Token> findAllValidTokenByUser(String userId);

    Optional<Token> findByToken(String token);
  
}
