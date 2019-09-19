package com.sda.cabinet_medical.service;

import com.sda.cabinet_medical.model.User;
import com.sda.cabinet_medical.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers () {
        return userRepository.findAll();
    }

    private Optional<User> getById(int id) {
        return this.userRepository.findById(id);
    }
    public void delete (int userID){
        Optional<User> optionalUser = this.getById(userID);
        if (optionalUser.isPresent()) {
            this.userRepository.delete(optionalUser.get());
        }
    }

    public User addNewUser(User user) {
        return userRepository.saveAndFlush(user);
    }
}