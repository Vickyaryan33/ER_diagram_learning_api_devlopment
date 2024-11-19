package com.example.Er_digram_Learning.Controller;

import com.example.Er_digram_Learning.Repository.ProfileRepository;
import com.example.Er_digram_Learning.Service.ProfileService;
import com.example.Er_digram_Learning.Service.UserService;
import com.example.Er_digram_Learning.entity.Profile;
import com.example.Er_digram_Learning.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/profile")
public class ProfileController {
   private ProfileService profileService;
   private UserService userService;

    public ProfileController(ProfileService profileService, UserService userService) {
        this.profileService = profileService;
        this.userService = userService;
    }
     @PostMapping("/add")
    public ResponseEntity<Profile> addProfile(@RequestBody Profile profile, @RequestParam long id){
        User user=userService.findById(id);
        profile.setUser(user);
        Profile p1=profileService.addProfile(profile);
        return new ResponseEntity<>(p1, HttpStatus.CREATED);
    }
}
