package net.yorksolutions.messageboardbackend.post;

import net.yorksolutions.messageboardbackend.requestBodies.RequestPostBody;
import net.yorksolutions.messageboardbackend.user.Account;
import net.yorksolutions.messageboardbackend.user.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static net.yorksolutions.messageboardbackend.Helpers.emptyCheck;
import static net.yorksolutions.messageboardbackend.Helpers.presenceCheck;

@Service
public class PostService {

    PostRepository repository;
    AccountRepository accountRepo;
    @Autowired
    public PostService(PostRepository postRepository, AccountRepository accountRepository){
        this.repository = postRepository;
        this.accountRepo = accountRepository;
    }

    public void CREATE_POST(RequestPostBody requestBody){
        System.out.println(requestBody.author);
        Account account = emptyCheck(accountRepo.findByUsername(requestBody.author));
        Post post = new Post(requestBody.title, requestBody.content, account);
        repository.save(post);
    }
    public Iterable<Post> GET_POSTS(){
        return repository.findAll();
    }
}
