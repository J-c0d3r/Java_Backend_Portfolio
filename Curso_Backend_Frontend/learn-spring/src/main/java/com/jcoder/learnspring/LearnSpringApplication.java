package com.jcoder.learnspring;

import com.jcoder.learnspring.infrastructure.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(LearnSpringApplication.class, args);
//
//
//        User user = new User("teste", "test@gmail.com", "123");
//        User user = new User();
//
//        user.setNome("testinho");
//
//        System.out.println(user.getNome());
//        System.out.println(user.getEmail());
//        System.out.println(user.getSenha());
//
//    }

    public static void main(String[] args) {
        SpringApplication.run(LearnSpringApplication.class, args);
    }

}
