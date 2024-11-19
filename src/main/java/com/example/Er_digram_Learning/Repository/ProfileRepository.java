package com.example.Er_digram_Learning.Repository;

import com.example.Er_digram_Learning.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}