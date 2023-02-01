package com.example.SpringSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    @GetMapping("/")
    public String greetings(){
        return "hello people";
    }
    @GetMapping("/user")
    public String user(){
        return "Hellow user";
    }
    @GetMapping("/admin")
    public String admin(){
        return "Hellow user";
    }
}
