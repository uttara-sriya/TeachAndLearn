package com.doit.Repository;

import com.doit.Domain.User;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sampa on 24-07-2016.
 */
@Repository
public interface UserDetailsRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
//    List<User> addUser(User user);
    //User validateUser(String username, String password);
}
