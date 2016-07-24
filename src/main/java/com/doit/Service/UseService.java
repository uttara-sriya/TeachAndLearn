package com.doit.Service;


import com.doit.Domain.User;

import java.util.List;

/**
 * Created by sampa on 22-07-2016.
 */
public interface UseService {
  //  User retrieve(String username);
//    User retrieveEmail(String email);
  User getEmail(String email);
  List<User> findByUserId(Long userId);
User findByUsername(String username);
  //void save(User user);


}
