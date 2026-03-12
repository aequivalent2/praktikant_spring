package com.example.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index(Model model) {
        // Wir übergeben eine Variable namens "message" an das Frontend
        model.addAttribute("message", "Willkommen in der Thymeleaf-Welt!");
        return "index"; // Sucht nach src/main/resources/templates/index.html
    }
}