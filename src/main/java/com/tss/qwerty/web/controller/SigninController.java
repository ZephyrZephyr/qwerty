package com.tss.qwerty.web.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Controller
@EnableAutoConfiguration
public class SigninController {
    /*
    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @RequestMapping("/signin")
    public String signin(){
        //map.put("signin","signin");
        return "/signin";
    }
    @RequestMapping("/myclasses")
    public  String myclssses(){
        return "myclasses";
    }
    @RequestMapping("/addlogin")
    public String login(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String result = "";
        result = "myclasses";
        return result;
    }
    */
}
