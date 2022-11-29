package com.cursor.cursor.repository;

import com.cursor.cursor.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
