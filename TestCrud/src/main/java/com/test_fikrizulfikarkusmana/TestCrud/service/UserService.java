package com.test_fikrizulfikarkusmana.TestCrud.service;

import com.test_fikrizulfikarkusmana.TestCrud.entity.User;
import com.test_fikrizulfikarkusmana.TestCrud.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public User saveUser(User user){
        return repository.save(user);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }
    public User getUserById(int userid){
        return repository.findById(userid).orElse(null);
    }

    public String deleteUser (int userid){
        repository.deleteById(userid);
        return "User Removed " +userid;
    }





}
