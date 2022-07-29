package net.yorksolutions.messageboardbackend.user;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserService {

    public void createUser(){
        System.out.println("User created!");
    }
    public HashMap<String, String> getUsers(){
        return new HashMap<>();
    }
    public HashMap<String, String> getUser(Long id){
        return new HashMap<>();
    }
}