package com.dabao.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("SERVICE-1")
public interface UserService {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String hi();
}
