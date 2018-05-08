package com.bing.service;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

    @RequestMapping(value = "sayHello", method = RequestMethod.GET)
    public String sayHello(@RequestParam String name) {
        System.out.println("name:" + name);
        return "hello " + name;
    }
}
