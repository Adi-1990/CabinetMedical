package com.sda.cabinet_medical.service;

import com.sda.cabinet_medical.model.User;
import com.sda.cabinet_medical.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers () {
        return userRepository.findAll();
    }

}
