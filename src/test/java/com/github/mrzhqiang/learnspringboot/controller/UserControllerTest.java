package com.github.mrzhqiang.learnspringboot.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;

/**
 * @author mrzhqiang
 */
public class UserControllerTest {

  private MockMvc mvc;

  @Before
  public void setUp() throws Exception {
    mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
  }

  @Test
  public void get() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/user/get").accept(MediaType.APPLICATION_JSON))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content()
            .json("{\n\"username\": \"v2.1json\",\n\"password\": \"123$%^\"\n}"));
  }
}