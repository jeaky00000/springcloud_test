package com.dabao.client.controller;

import com.dabao.client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")


public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/all")
    public String GetUserName() {
        String content = restTemplate.getForEntity("http://SERVICE-1/hi", String.class).getBody();
        System.out.println(content);
        return content;
    }
    @Autowired
    private UserService userService;
    @RequestMapping("/all2")
    public String GetUserName2(){
        System.out.println("feign client simulate.........");
        return userService.hi();
    }
}
