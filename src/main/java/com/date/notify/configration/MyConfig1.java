package com.date.notify.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig1 {

    @Bean
    public UserService get(){
        System.out.println("test");
        UserService userService = new UserService();
        return userService;
    }
}
