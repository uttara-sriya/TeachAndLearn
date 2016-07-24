package com.doit.Service;

import com.doit.Domain.User;
import com.doit.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sampa on 22-07-2016.
 */
@Service
public class UserServiceImpl  implements UseService{

    //private BCryptPasswordEncoder bCryptPasswordEncoder;
    private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public Iterable<User> List(){
        return userRepository.findAll();
    }
    @Override
    public User getEmail(String email) {
        return  userRepository.findAllByEmail(email);
    }

    @Override
    public List<User> findByUserId(Long userId) {
        return  userRepository.findUserByUserId(userId);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }


//    @Override
//    public void save(User user) {
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        //user.setRoles(new HashSet<>(roleRepository.findAll()));
//        userRepository.save(user);
//    }


//    @Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    List<User> users = new ArrayList<User>();
///*
//    @Override
//    public User retrieve(String username) {
//        String sql = "SELECT username FROM user WHERE username = ?";
//        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, new Object[] { username }, new UserRowMapper());
//        for (Map<String, Object> row: rows) {
//            User user = new User((String) row.get("username"));
//            users.add(user);
//        }
//        User user = users.get(0);
//        return user;
//    }
//*/
//     @Override
//     public User retrieveEmail(String email){
//         User u=new User();
//         String sql = "SELECT email FROM user WHERE email = ?";
//         u= (User) getJdbcTemplate().query(sql, new Object[]{email}, this);
//        return u;
//     }
//
//
//    @Override
//    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
//        User user = new User();
//       user.setEmail(resultSet.getString("email"));
//        return user;
//
//    }
}
