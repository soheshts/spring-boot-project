package io.github.soheshts.springBoot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
Author: Sohesh TS
Date: 12/18/2020
*/
@RestController
@RequestMapping("/home")
public class HomeController {
    /*
    * sample URL: http://localhost:8080/home/welcome/sohesh
    * */
    @RequestMapping("/welcome/{name}")
    public String welcome(@PathVariable("name") String name){
        return "Hello, " + name;

    }
}
