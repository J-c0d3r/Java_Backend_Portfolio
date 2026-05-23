package com.myrepstudy.crud_user.controller;

import com.myrepstudy.crud_user.business.UserService;
import com.myrepstudy.crud_user.infrastructure.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<Void> salveUser(@RequestBody User user) {
        userService.SaveUser(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<User> findUserByEmail(@RequestParam String email) {
        return ResponseEntity.ok(userService.findUserByEmail(email));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteUserByEmail(@RequestParam String email) {
        userService.deleteUserByEmail(email);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> updateUserById(@RequestParam Integer id, @RequestBody User user) {
        userService.updateUserById(id, user);
        return ResponseEntity.ok().build();
    }

}
