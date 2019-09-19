package com.sda.cabinet_medical.controller;

import com.sda.cabinet_medical.model.User;
import com.sda.cabinet_medical.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping({"/list"})
    public String getAll(Model model) {
        List<User> userList = userService.getAllUsers();
        model.addAttribute("userList", userList);
        model.addAttribute("user", new User());
        return "/list";
    }

    @PostMapping({"/save"})
    public String save (@ModelAttribute User user, Model model){
        user = this.userService.addNewUser(user);
        return "redirect:/user/list";
    }
}