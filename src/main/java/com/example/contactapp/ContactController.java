package com.example.contactapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String showForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute Contact contact, Model model) {
        model.addAttribute("name", contact.getName());
        return "thankyou";
    }
}
