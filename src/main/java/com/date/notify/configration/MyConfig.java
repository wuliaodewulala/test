package com.date.notify.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Import(UserService1.class)
//@Import(TestBean1.class)
//@Import(MyImportSelector.class)
//@Import(MyImportBeanDefinitionRegister.class)
public class MyConfig {

    @Bean
    public UserService2 getUser(){
        System.out.println("test");
        UserService2 userService =  getUser2();
        UserService2 userServiceFork =  getUser2();
        return userService;
    }

    @Bean
    public UserService2 getUser2(){
        UserService2 userService = new UserService2();
        return userService;
    }
}
