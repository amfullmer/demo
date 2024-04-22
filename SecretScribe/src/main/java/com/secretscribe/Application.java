package com.secretscribe;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class Application {
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//    }
//
//}

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//public class Application {
//
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//    }
//
//}

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // Enable cross-origin requests for the entire application
    @CrossOrigin
    public class CrossOriginConfig {}

}
