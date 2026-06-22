package com.jc0d3r.api_user_mongodb.controller;

import com.jc0d3r.api_user_mongodb.business.UserService;
import com.jc0d3r.api_user_mongodb.infrastructure.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //esta classe recebe requisições http
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> salveUser(@RequestBody User user) {
        return ResponseEntity.ok().body(userService.SalveUser(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> searchUsers() {
        return ResponseEntity.ok().body(userService.searchUsers());
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        return ResponseEntity.ok().body(userService.updateUser(user));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteUser(@RequestParam("id") String id) {
        userService.deleteUser(id);
        return ResponseEntity.accepted().build();
    }

}
