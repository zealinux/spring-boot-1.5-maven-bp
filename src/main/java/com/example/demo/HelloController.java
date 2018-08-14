package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//  @Autowired
//  private HttpServletRequest request;
//
//  @Autowired
//  private HttpServletResponse response;

  @RequestMapping("/hello")
  @ResponseBody
  public String hello() {
    return "Hello";
  }

}
