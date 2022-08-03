package net.yorksolutions.messageboardbackend.post;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.yorksolutions.messageboardbackend.user.Account;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @JsonProperty
    Long id;
    @JsonProperty
    String title;
    @JsonProperty
    String content;
    @JsonProperty
    @ManyToOne()
    Account author;
    @JsonProperty
    LocalDateTime created;
    @JsonProperty
    Boolean isEditing;

    public Post(){}
    public Post(String title, String content, Account author){
        this.title = title;
        this.content = content;
        this.author = author;
        this.created = java.time.LocalDateTime.now();
        this.isEditing = false;
    }
}
