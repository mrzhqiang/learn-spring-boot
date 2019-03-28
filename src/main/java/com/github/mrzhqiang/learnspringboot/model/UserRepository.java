package com.github.mrzhqiang.learnspringboot.model;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mrzhqiang
 */
public interface UserRepository extends JpaRepository<User, Long> {
  User findByUsername(String username);
}
