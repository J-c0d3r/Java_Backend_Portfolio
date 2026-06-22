package com.jc0d3r.api_user_mongodb.business;

import com.jc0d3r.api_user_mongodb.infrastructure.entities.User;
import com.jc0d3r.api_user_mongodb.infrastructure.repository.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User SalveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> searchUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User user) {
        Optional<User> userExist = userRepository.findById(user.getId());

        if (userExist.isPresent())
            return userRepository.save(user);

        return new User();
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

}
