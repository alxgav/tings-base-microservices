package com.tings.userservice.service;

import com.tings.userservice.models.User;
import com.tings.userservice.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository userRepository;

    public User createUser(User user){
        user = userRepository.save(user);
        log.info("User is created {}", user.getId());
        return user;
    }

    public List<User> getAllUser() {
       return  userRepository.findAll();
    }

    public User updateUser(User user){
        user = userRepository.save(user);
        log.info("User is updated {}", user.getId());
        return user;
    }

    @Transactional
    public void deleteUser(UUID id){
        userRepository.deleteById(id);
    }
}
