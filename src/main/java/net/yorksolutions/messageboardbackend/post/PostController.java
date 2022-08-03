package net.yorksolutions.messageboardbackend.post;

import net.yorksolutions.messageboardbackend.requestBodies.RequestPostBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/posts")
@CrossOrigin
public class PostController {

    PostService service;
    @Autowired
    public PostController(PostService postService){this.service = postService;}

    @PostMapping
    public void create(@RequestBody RequestPostBody requestBody){
        requestBody.print();
        service.CREATE_POST(requestBody);
    }
    @GetMapping
    public Iterable<Post> getAll(){
        return service.GET_POSTS();
    }
    @GetMapping("/{id}")
    public void get(@PathVariable Long id){
        System.out.println("getting 1 post...");
    }
    @PutMapping
    public void update(){
        System.out.println("updating post...");
    }
    @DeleteMapping
    public void destroy(){
        System.out.println("deleting post...");
    }
}
