package net.yorksolutions.messageboardbackend.user;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.Optional;

@Service
public class AccountService {

    AccountRepository repository;

    public AccountService(AccountRepository accountRepository){
        this.repository = accountRepository;
    }

    public void createUser(String name, String username, String password){
        Optional<Account> userOpt = repository.findByUsername(username);
        if (userOpt.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        Account user = new Account(name, username, password);
        repository.save(user);
    }
    public Boolean checkCred(String username, String password){
        Optional<Account> userOpt = repository.findByUsernameAndPassword(username, password);
        return userOpt.isPresent();
    }
    public Iterable<Account> getUsers(){
        return repository.findAll();
    }
    public Optional<Account> getUser(Long id){
        return repository.findById(id);
    }
}