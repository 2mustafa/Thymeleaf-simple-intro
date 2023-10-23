package com.test.thymeleafdemo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AppController {

    @GetMapping("/hello")
    public String sayHello(Model theModel) {
        theModel.addAttribute("theData", new java.util.Date());
        return "helloworld";
    }
}
