package com.yujj.springboot_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @Autowired
    private girlProperties girl;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return girl.getCupSize();

    }
}
