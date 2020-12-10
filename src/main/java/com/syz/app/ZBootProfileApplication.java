package com.syz.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZBootProfileApplication {

    public static void main(String[] args) {
        ObjectMapper om = new ObjectMapper();
        om.getFactory();
        SpringApplication.run(ZBootProfileApplication.class, args);
    }

}
