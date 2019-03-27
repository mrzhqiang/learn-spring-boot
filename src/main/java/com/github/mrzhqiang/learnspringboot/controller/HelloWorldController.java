package com.github.mrzhqiang.learnspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mrzhqiang
 */
@RestController
public class HelloWorldController {
  @RequestMapping("/hello")
  public String index() {
    return "Hello World";
  }
}
