package com.example.demo;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerTest {

  /**
   * Test with MocMvc
   */

  @Autowired
  private MockMvc mvc;

  @Test
  public void testHelloWithMoc() {
    try {
      mvc.perform(
          MockMvcRequestBuilders
              .get("/hello")
              .accept(MediaType.APPLICATION_JSON)
      ).andExpect(status().isOk())
          .andExpect(content().string(equalTo("Hello")));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
