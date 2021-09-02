package com.sylinx.lesson3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConroller {
    @GetMapping("/test")
    public String helloworld(){
        return "myhelloworld";
    }
}
