package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
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


    @RequestMapping("hello")
    public String helloWorld(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hello "+name+"!!";
    }
    
}
