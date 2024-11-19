package com.example.Er_digram_Learning.Controller;

import com.example.Er_digram_Learning.Service.UserService;
import com.example.Er_digram_Learning.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
  @PostMapping("/add")
    public ResponseEntity<User> addUser(
            @RequestBody User user){
        User user1=userService.addUser(user);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }
}
