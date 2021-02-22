package com.javaguru.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class ToDoListWebApplication {


        public static void main(String[] args) {
            SpringApplication.run(ToDoListWebApplication.class, args);
        }
    }

