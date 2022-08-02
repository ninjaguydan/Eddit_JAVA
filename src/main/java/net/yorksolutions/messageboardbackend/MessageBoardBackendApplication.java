package net.yorksolutions.messageboardbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageBoardBackendApplication {

    public static void main(String[] args) {

        SpringApplication.run(MessageBoardBackendApplication.class, args);
        System.out.println("We GOOD");
    }

}
