package com.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title" , "Hola mundo Sring Boot");
        model.addAttribute("name" , "Michael");
        model.addAttribute("lastname" , "Joseph");
        return "details";
    }
}
