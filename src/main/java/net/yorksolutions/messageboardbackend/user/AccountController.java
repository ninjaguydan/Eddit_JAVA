package net.yorksolutions.messageboardbackend.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class AccountController {

    AccountService service;
    @Autowired
    AccountController(AccountService accountService){
        this.service = accountService;
    }

    @PostMapping("/register")
    public void register(@RequestBody UserAuthRequest requestBody){
        service.createUser(requestBody.name, requestBody.username, requestBody.password);
    }

    @PostMapping("/login")
    public Boolean login(@RequestBody UserAuthRequest requestBody){
        return service.checkCred(requestBody.username, requestBody.password);
    }

    @GetMapping
    public Iterable<Account> users(){
        return service.getUsers();
    }

    @GetMapping("/{id}")
    public Optional<Account> user(@PathVariable Long id){
        System.out.println("get " + id);
        return service.getUser(id);
    }
}
class UserAuthRequest {
    public String name;
    public String username;
    public String password;
}
