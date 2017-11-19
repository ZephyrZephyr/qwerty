package com.tss.qwerty.web.controller;

import com.tss.qwerty.domain.User;
import com.tss.qwerty.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Controller
@EnableAutoConfiguration
public class SigninController {

    @Autowired
    UserinfoService userinfoService;

    @RequestMapping("/")
    public String home(){
        return "signin";
    }

   /* @RequestMapping("/signin")
    public String signin(){
        //map.put("signin","signin");
        return "/signin";
    }*/
    @RequestMapping("/myclasses")
    public  String myclssses(){
        return "myclasses";
    }
    @RequestMapping("/addlogin")
    public String login(HttpServletRequest request){
        String email = request.getParameter("username");
        String password = request.getParameter("password");

        User user = userinfoService.getUser(email);
        System.out.println(user.toString());
        String result = "";
        result = "index";
        return result;
    }
}
