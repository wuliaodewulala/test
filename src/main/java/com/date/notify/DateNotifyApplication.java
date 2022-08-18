package com.date.notify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DateNotifyApplication {
    public static void main(String[] args) {
        SpringApplication.run(DateNotifyApplication.class,args);
    }
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext cac = new AnnotationConfigApplicationContext(MyConfig.class);
//        MyConfig myConfig = cac.getBean(MyConfig.class);
//        System.out.println(myConfig);
//        cac.close();
//    }
}
