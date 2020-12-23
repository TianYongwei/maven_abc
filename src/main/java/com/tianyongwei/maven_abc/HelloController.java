package com.tianyongwei.maven_abc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/hello")
public class HelloController {

  @GetMapping("/1")
  public Object hello() {
    return new HashMap<String, String>() {{
      put("你好，", "世界");
    }};
  }
}
