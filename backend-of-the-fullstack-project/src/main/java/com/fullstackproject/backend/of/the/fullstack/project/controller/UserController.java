package com.fullstackproject.backend.of.the.fullstack.project.controller;

import com.fullstackproject.backend.of.the.fullstack.project.model.User;
import com.fullstackproject.backend.of.the.fullstack.project.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/user/")
@CrossOrigin("http://localhost:3000/")
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @PostMapping("save")
    User newUser(@RequestBody User user){
        return userRepo.save(user);
    }

    @GetMapping("users")
    List<User> getAll(){
        return userRepo.findAll();
    }

    @GetMapping("users/{id}")
    Optional<User> getUserById(@PathVariable Long id){
        return userRepo.findById(id);
    }

    @PutMapping("users/{id}")
    Optional<User> updateUser(@RequestBody User newUser,@PathVariable Long id){
        return userRepo.findById(id).map(
                user -> {
                    user.setUsername(newUser.getUsername());
                    user.setName(newUser.getName());
                    user.setEmail(newUser.getEmail());
                    return userRepo.save(user);
                }
        );
    }

    @DeleteMapping("users/{id}")
    String deleteUser(@PathVariable Long id){
        userRepo.deleteById(id);
        return "User "+id+" Has been deleted";
    }
}
