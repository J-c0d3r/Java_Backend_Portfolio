package com.jcoder.learnspring.infrastructure.repository;

import com.jcoder.learnspring.infrastructure.entity.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelephoneRepository extends JpaRepository<Telephone, Long> {
}
