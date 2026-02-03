package com.vincent.backend.controller;

import com.vincent.backend.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<User> users = new ArrayList<>();
    private Long idCounter = 1L;


    @PostMapping
    public User addUser(@RequestBody User user) {
        user.setId(idCounter++);
        users.add(user);
        return user;
    }

    @GetMapping
    public List<User> getUsers() {
        return users;
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }


}
