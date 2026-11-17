package com.jc0d3r.api_produto_jwt_postgresql.Services;

import com.jc0d3r.api_produto_jwt_postgresql.Model.User;
import com.jc0d3r.api_produto_jwt_postgresql.Repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public User registerUser(String username, String password) {
        String passwordCrypt = passwordEncoder.encode(password);
        User user = new User(username, passwordCrypt);
        return userRepository.save(user);
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
