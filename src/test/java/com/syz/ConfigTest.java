package com.syz;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            InputStream in = ConfigTest.class.getClassLoader().getResourceAsStream("config.properties");
            properties.load(in);
            System.out.println(properties.getProperty("url"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
