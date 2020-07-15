package com.letr1x3n.stickerworld.repository;

import com.letr1x3n.stickerworld.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    User findByActivationCode(String code);
}
