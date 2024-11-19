package com.example.Er_digram_Learning.Service;

import com.example.Er_digram_Learning.Repository.UserRepository;
import com.example.Er_digram_Learning.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        userRepository.save(user);
        return user;
    }

    public User findById(long id) {
        return userRepository.findById(id).get();
    }
}
