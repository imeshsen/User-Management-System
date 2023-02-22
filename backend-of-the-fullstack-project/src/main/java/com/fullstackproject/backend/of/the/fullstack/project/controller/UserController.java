package com.fullstackproject.backend.of.the.fullstack.project.controller;

import com.fullstackproject.backend.of.the.fullstack.project.model.User;
import com.fullstackproject.backend.of.the.fullstack.project.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user/")
@CrossOrigin
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @PostMapping("save")
    User newUser(@RequestBody User user){
        return userRepo.save(user);
    }

    @GetMapping("/users")
    List<User> getAll(){
        return userRepo.findAll();
    }
}
