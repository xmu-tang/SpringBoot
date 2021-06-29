package com.driver.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.driver.service.CategoryServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("category")
public class MyController {
    @Autowired
    private CategoryServiceTest categoryServiceTest;

    @RequestMapping("getUser/{id}")
    public String getUser(@PathVariable("id") int id) {
        return categoryServiceTest.getCategory(id).toString();
    }
    @RequestMapping("helloworld")
    public String out(){
        return "hello";
    }
}
