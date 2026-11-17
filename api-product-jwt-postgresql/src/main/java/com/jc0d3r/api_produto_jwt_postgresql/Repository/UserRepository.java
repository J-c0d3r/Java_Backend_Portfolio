package com.jc0d3r.api_produto_jwt_postgresql.Repository;

import com.jc0d3r.api_produto_jwt_postgresql.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

}
