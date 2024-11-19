package com.example.Er_digram_Learning.Service;

import com.example.Er_digram_Learning.Repository.ProfileRepository;
import com.example.Er_digram_Learning.entity.Profile;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    private ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }


    public Profile addProfile(Profile profile) {
        return profileRepository.save(profile);
    }
}
