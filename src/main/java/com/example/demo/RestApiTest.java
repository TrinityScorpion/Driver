package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RestApiTest {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/maniek")
    public String getManiek(){
        return "/pic.jsp";
    }

    @GetMapping("/maniek/1")
    public String getManiek1(){
        return "jestem maniek1";
    }

    @DeleteMapping("/maniek/1")
    public String deleteManiek(){
        return "deleted maniek";
    }


}
