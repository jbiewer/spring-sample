package com.springsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * To have the API be accessible, we call SpringApplication::run with our Application class (annotated as a
 * SpringBootApplication) which will start a server and open the endpoints, listening for any requests coming in.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
