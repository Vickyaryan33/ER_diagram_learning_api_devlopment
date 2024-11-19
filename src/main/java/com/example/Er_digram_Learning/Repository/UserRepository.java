package com.example.Er_digram_Learning.Repository;

import com.example.Er_digram_Learning.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}