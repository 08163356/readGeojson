package edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        System.out.println(getInfo());

    }

    public static String getInfo() {
        String msg = "";
        try {
            Resource resource = new ClassPathResource("file/a.txt");
            File file = resource.getFile();
            msg = file.getAbsolutePath();
            System.out.println(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

}
