package com.letr1x3n.notatwitter.repository;

import com.letr1x3n.notatwitter.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
