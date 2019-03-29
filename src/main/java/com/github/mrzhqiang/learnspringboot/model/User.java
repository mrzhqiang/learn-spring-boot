package com.github.mrzhqiang.learnspringboot.model;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author mrzhqiang
 */
@Entity
public class User {
  @Id
  @GeneratedValue
  public Long id;
  @Column(nullable = false, unique = true)
  public String username;
  @Column(nullable = false)
  public String password;
  @Column(nullable = false)
  public String email;
  @Column(nullable = false)
  public String nickname;
  @Column(nullable = false)
  public Instant created;
  public Instant updated;
}
