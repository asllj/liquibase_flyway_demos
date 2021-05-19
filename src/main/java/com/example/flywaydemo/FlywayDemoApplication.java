package com.example.flywaydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlywayDemoApplication implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(FlywayDemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        repository.save(User.builder()
                .id(1L)
                .username("ana.jesus")
                .firstName("Ana")
                .lastName("Jesus")
                .phone(123456789)
                .build());
    }
}
