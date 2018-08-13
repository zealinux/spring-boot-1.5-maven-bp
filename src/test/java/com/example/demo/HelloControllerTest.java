package com.example.demo;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

  /**
   * Test with MocMvc
   */

  private MockMvc mvc;

  @Before
  public void setUp() {
    mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
  }

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