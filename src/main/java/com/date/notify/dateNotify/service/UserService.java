package com.date.notify.dateNotify.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


public class UserService {

    private String username;
    private  String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
