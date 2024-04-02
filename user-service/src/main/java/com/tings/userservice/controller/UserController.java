package com.tings.userservice.controller;


import com.tings.userservice.models.User;
import com.tings.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
@RequestMapping("/tings/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<User> getAllUser(){
        return userService.getAllUser();
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public  User updateUser(@PathVariable UUID id, @RequestBody User user){
        user.setId(id);
        return userService.updateUser(user);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser(@PathVariable UUID id){
        userService.deleteUser(id);
    }
}
