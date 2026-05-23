package com.myrepstudy.crud_user.business;

import com.myrepstudy.crud_user.infrastructure.entities.User;
import com.myrepstudy.crud_user.infrastructure.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void SaveUser(User user) {
        repository.saveAndFlush(user);
    }

    public User findUserByEmail(String email) {

        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado")
        );
    }

    public void deleteUserByEmail(String email) {
        repository.deleteByEmail(email);
    }

    public void updateUserById(Integer id, User user) {
        User userEntity = repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));

        User userUpdated = User.builder()
                .email(user.getEmail() != null ? user.getEmail() : userEntity.getEmail())
                .nome(user.getNome() != null ? user.getNome() : userEntity.getNome())
                .id(userEntity.getId())
                .build();
        repository.saveAndFlush(userUpdated);
    }
}
