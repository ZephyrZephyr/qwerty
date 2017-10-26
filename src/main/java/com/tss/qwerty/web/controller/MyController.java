package com.tss.qwerty.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    @RequestMapping("/hello")
    public String hello(){
        return "signin";
    }
}
