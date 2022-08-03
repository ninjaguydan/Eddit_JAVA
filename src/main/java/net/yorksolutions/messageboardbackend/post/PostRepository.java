package net.yorksolutions.messageboardbackend.post;

import net.yorksolutions.messageboardbackend.user.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostRepository extends CrudRepository<Post,Long> {
}
