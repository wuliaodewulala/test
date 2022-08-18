package com.date.notify.dateNotify.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author better3.pan
 * @date 2022/8/18 16:00
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get")
    public String getMsg(){
        return "hello";
    }

}
