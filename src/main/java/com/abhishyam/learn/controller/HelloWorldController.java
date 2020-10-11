package com.abhishyam.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Abhishyam.c on 11/10/20
 */

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld(Model model){
        model.addAttribute("message", "Hello World");
        return "helloworld";
    }

    @GetMapping("/style")
    public String style(){
        return "add-css-js-demo";
    }

    @GetMapping("/bootstrap")
    public String bootstrap(){
        return "add-bootstrap";
    }
}
