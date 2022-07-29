package net.yorksolutions.messageboardbackend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService service;

    @Autowired
    UserController(UserService userService){
        this.service = userService;
    }
    @PostMapping("/")
    public void register(){
        service.createUser();
    }
    @GetMapping("/")
    public HashMap<String, String> users(){
        return service.getUsers();
    }
    @GetMapping("/{id}")
    public HashMap<String, String> user(@PathVariable Long id){
        return service.getUser(id);
    }
}

