package com.desafiosstarcode.desafios_starcode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DesafioController {

    @GetMapping("/desafio001")
    public String desafio001(Model model) {
        
        return "desafio001";
    }
}
