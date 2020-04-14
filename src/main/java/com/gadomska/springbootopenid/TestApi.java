package com.gadomska.springbootopenid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

    @GetMapping("/test1")
    public String test1(){
        return "Test1";
    }

    @GetMapping("/test2")
    public String test2(){
        return "Test2";
    }

}
