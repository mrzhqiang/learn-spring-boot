package com.github.mrzhqiang.learnspringboot.controller;

import com.github.mrzhqiang.learnspringboot.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mrzhqiang
 */
@RestController
public class UserController {

  @RequestMapping("/user/get")
  public User get() {
    User user = new User();
    user.username = "v2.1json";
    user.password = "123$%^";
    return user;
  }
}
