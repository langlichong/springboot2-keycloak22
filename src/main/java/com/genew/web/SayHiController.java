package com.genew.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHiController {

    @GetMapping("/")
    public String root(){
        return "Hi, this api is public ";
    }



    @GetMapping("/visitor")
    public String visitor(){
        return "Hi, when you see the content , you has authenticated !";
    }
}
