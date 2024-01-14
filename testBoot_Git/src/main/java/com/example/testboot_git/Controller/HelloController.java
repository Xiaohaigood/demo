package com.example.testboot_git.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
    @GetMapping("/test")
    public String test() {
        return "test";
    }
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
