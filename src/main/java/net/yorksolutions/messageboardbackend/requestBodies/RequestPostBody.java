package net.yorksolutions.messageboardbackend.requestBodies;

import java.util.HashMap;

public class RequestPostBody {
    public Long id;
    public String title;
    public String content;
    public String author;

    public void print(){
        System.out.println(title);
        System.out.println(content);
        System.out.println(author);
    }

}
