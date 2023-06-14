package com.test_fikrizulfikarkusmana.TestCrud.controller;

import com.test_fikrizulfikarkusmana.TestCrud.entity.User;
import com.test_fikrizulfikarkusmana.TestCrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/adduser")
    public User addUser(@RequestBody User user){
        return service.saveUser(user);
    }


    @GetMapping ("/users")
    public List<User> findAllUsers(){
        return service.getUsers();
    }

    @GetMapping("/users/id/{userid}")
    public User findUserById(@PathVariable Integer userid) {
        return service.getUserById(userid);
    }

    @DeleteMapping("/delete/{userid}")
    public String deleteUser(@PathVariable int userid) {
        return service.deleteUser(userid);
    }
}
