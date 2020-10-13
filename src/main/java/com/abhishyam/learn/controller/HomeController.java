package com.abhishyam.learn.controller;

import com.abhishyam.learn.db.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Abhishyam.c on 14/10/20
 */
@Controller
public class HomeController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("users", userRepo.findAll());
        return "index";
    }
}
