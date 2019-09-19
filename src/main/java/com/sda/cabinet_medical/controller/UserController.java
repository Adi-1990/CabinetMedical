package com.sda.cabinet_medical.controller;

import com.sda.cabinet_medical.model.User;
import com.sda.cabinet_medical.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping({"/list"})
    public String getAll(Model model) {
        List<User> allUsers = userService.getAllUsers();
        model.addAttribute("users", allUsers);
        return "/list";
    }

}