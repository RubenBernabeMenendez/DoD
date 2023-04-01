package com.dod.DodService.User;

import com.dod.DodData.model.User.User;
import com.dod.DodData.repository.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User getUserbyUserId(Long userId) {
        return userRepository.findByUserId(userId);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
