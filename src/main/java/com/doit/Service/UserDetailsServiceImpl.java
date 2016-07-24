package com.doit.Service;


import com.doit.Domain.Role;
import com.doit.Domain.User;
import com.doit.Repository.UserDetailsRepository;
import com.doit.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by sampa on 24-07-2016.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

//    @Override
//    public User getUser(String username, String password) {
//        return this.userDetailsRepository.validateUser(username,password);
//    }

//    @Override
//    public List<User> addUser(User user) {
//        return userDetailsRepository.addUser(user);
//    }
//    @Override
//    @Transactional(readOnly = true)
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user=userDetailsRepository.findByUsername(username);
//        Set<GrantedAuthority> grantedAuthorities=new HashSet<>();
//       grantedAuthorities.add(new SimpleGrantedAuthority(user.getUsername()));
//        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),grantedAuthorities);
//    }
}
