package com.date.notify.configration;


public class UserService2 {

    public UserService2() {
        System.out.println("创建用户");
    }

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
