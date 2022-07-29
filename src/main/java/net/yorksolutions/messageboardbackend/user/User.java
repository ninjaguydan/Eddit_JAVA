package net.yorksolutions.messageboardbackend.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    public Long id;

    public User(){}
}
