package com.abhishyam.learn.controller;

import com.abhishyam.learn.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @author Abhishyam.c on 13/10/20
 */
@Controller
public class UserController {

    List<User> userList = Arrays.asList(
            new User("abhishyam", "abhishyam@gmail.com", "ADMIN"),
            new User("charan", "charan@gmail.com","Admin"),
            new User("kiran","kiran@gmail.com","USER"),
            new User("harsha", "harsha@gmail.com","USER")
    );

    @GetMapping("/if-unless")
    public String getAllUsers(Model model){
            model.addAttribute("users", userList);
            return "if-unless";
    }

    @GetMapping("/switch-case")
    public String switchCase(Model model){
        User user = new User("dheeraj", "dheeraj@gmail.com", "ADMIN");
        model.addAttribute("user", user);
        return "switch-case";
    }
}
