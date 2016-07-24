package com.doit.Repository;

import com.doit.Domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
   // public User findByUserName(String username);
   User findAllByEmail(@Param("email") String email);
    @Query("select u.username,r.name from User u,Role r where u.userId= ?1 and r.user_id= ?1")
    List<User> findUserByUserId(@Param("userId") Long userId);
    User findByUsername(String username);

}