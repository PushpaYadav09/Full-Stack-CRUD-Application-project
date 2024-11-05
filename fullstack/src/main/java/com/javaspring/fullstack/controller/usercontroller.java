package com.javaspring.fullstack.controller;

import com.javaspring.fullstack.model.user;
import com.javaspring.fullstack.repository.userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class usercontroller {


    @Autowired
    private userrepository userrepository;

    @PostMapping
    user newuser(@RequestBody user newuser){

        return userrepository.save(newuser);
    }


}
