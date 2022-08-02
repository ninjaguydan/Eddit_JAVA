package net.yorksolutions.messageboardbackend.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @JsonProperty
    Long id;
    @JsonProperty
    String name;
    @JsonProperty
    String username;
    String password;

    public Account(){}
    public Account(String name, String username, String password){
        this.name = name;
        this.username = username;
        this.password = password;
    }
}
