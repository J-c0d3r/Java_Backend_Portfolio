package com.jcoder.learnspring.business;

import com.jcoder.learnspring.infrastructure.entity.User;
import com.jcoder.learnspring.infrastructure.exceptions.ConflictException;
import com.jcoder.learnspring.infrastructure.exceptions.ResourceNotFoundException;
import com.jcoder.learnspring.infrastructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor //serve para os campos que contenham o final
public class UserService {

    //com o construtor permite realizar testes unitarios
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//        System.out.println(userRepository.getClass().getName());
//    }

    public User saveUser(User user) {
        try {
            emailExist(user.getEmail());
            user.setSenha(passwordEncoder.encode(user.getSenha()));
            return userRepository.save(user);
        } catch (ConflictException e) {
            throw new ConflictException("Email ja cadastrado", e.getCause());
        }
    }

    public void emailExist(String email) {
        try {
            boolean exist = verifyemailExist(email);
            if (exist) {
                throw new ConflictException("Email já cadastrado" + email);
            }
        } catch (ConflictException e) {
            throw new ConflictException("Email ja cadastrado", e.getCause());
        }
    }


    public boolean verifyemailExist(String email) {
        return userRepository.existsByEmail(email);
    }

    public User buscarUsuarioPorEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(
                () -> new ResourceNotFoundException("Email não encontrado " + email));
    }

    public void deletaUserPorEmail(String email) {
        userRepository.deleteByEmail(email);
    }

}
