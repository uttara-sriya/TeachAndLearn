package com.doit.Controller;

import com.doit.Domain.User;
import com.doit.Repository.UserDetailsRepository;
import com.doit.Repository.UserRepository;
import com.doit.Service.UseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by sampa on 22-07-2016.
 */
@RestController
@RequestMapping("/map")
public class UserController {


//    @Autowired
//    private SecurityService securityService;

    private UserRepository userRepository;
    private UserDetailsRepository userDetailsRepository;
    private UseService useService;
    @Autowired
    public UserController(UseService useService, UserRepository userRepository, UserDetailsRepository userDetailsRepository){
        this.useService=useService;
        this.userRepository=userRepository;
        this.userDetailsRepository=userDetailsRepository;
    }

    @RequestMapping(value = "/byEmail/{email}", method = RequestMethod.GET)
    public User byEmail(@PathVariable(value = "email") String email){
        return  useService.getEmail(email);
    }

    @RequestMapping(value = "/byId/{userId}", method = RequestMethod.GET)
    public  List<User> byId(@PathVariable(value = "userId") Long userId){
        return  useService.findByUserId(userId);
    }

    @RequestMapping(value ="/all", method = RequestMethod.GET)
    public Iterable<User> getAll(){
        return userRepository.findAll();
    }

    @RequestMapping(value = "/byUser", method = RequestMethod.POST)
    public User getByUsername(@PathVariable(value = "username") String username){
        User user= useService.findByUsername(username);
       return user;
    }


    @RequestMapping(value = "/usr",method = RequestMethod.POST)
    public User getByLogin(@RequestParam String username){
        User user1= useService.findByUsername(username);
        return user1;

    }
//    @RequestMapping(value = "/val",method = RequestMethod.POST)
//    @ResponseBody
//    public User validations(@PathVariable("username") String  username,@PathVariable("password") String password){
//        return  this.userDetailsRepository.validateUser(username, password);
//    }
//    @RequestMapping(value = "/list", method = RequestMethod.POST)
//    public @ResponseBody List<User> getAll(User user){
//        List<User> list=userDetailsRepository.addUser(user);
//        if(list!=null){
//            return list;
//        }else{
//            return null;
//        }
//    }
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public User login(@PathVariable User user){
//     if (user.getUsername()!=null && user.getEmail()!=null){
//         securityService.autologin(user.getUsername(),user.getPassword());
//         return user;
//     }
//         return null;
//    }

//    @Autowired
//     UseService useService;
  /*  @RequestMapping(value = "/{username}" , method = RequestMethod.GET)
    public User get(@PathVariable("username") String username){

        return useService.retrieve(username);
    }
    */

//
//    @RequestMapping(value = "/{email}",method = RequestMethod.GET)
//    public User getemail(@PathVariable("email") String email){
//        return useService.retrieveEmail(email);
//    }
}
