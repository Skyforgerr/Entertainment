package com.myentertainmantsearch.entertainmentsearch.repositories;

import java.util.Optional;

import com.myentertainmantsearch.entertainmentsearch.models.User;

public interface UserRepository {

  Optional<User> findByEmail(String email);
  
}
