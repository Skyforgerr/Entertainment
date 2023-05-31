package com.myentertainmantsearch.entertainmentsearch.token;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.myentertainmantsearch.entertainmentsearch.models.User;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tokens")
public class Token {
  @Id
  @GeneratedValue
  public Long id;

  @Field // Может быть проблема, так как нет unique=true
  public String token;

  @Field
  @Enumerated(EnumType.STRING)
  public TokenType tokenType = TokenType.BEARER;

  @Field
  public boolean revoked;

  @Field
  public boolean expired;

  @DBRef
  public User user;

}
