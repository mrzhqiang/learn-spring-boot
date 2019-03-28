package com.github.mrzhqiang.learnspringboot.model;

import java.time.Instant;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author mrzhqiang
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

  @Resource
  private UserRepository userRepository;

  @Test
  public void test() {
    User user = new User();
    user.username = "test";
    user.password = "123456";
    user.nickname = "测试";
    user.email = "123456@qq.com";
    user.created = Instant.now();
    user.updated = null;
    userRepository.save(user);
    User test = userRepository.findByUsername("test");
    assertEquals(user.nickname, test.nickname);
    userRepository.delete(test);
  }

}