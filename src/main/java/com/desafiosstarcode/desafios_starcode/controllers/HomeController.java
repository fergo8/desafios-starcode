package com.desafiosstarcode.desafios_starcode.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.desafiosstarcode.desafios_starcode.models.Desafio;


@Controller
public class HomeController {

	@GetMapping("/")
    public String home(Model model) {
        List<Desafio> listDesafio = ListarDesafio();

        model.addAttribute("Desafios", listDesafio);
        
        return "home";
    }

    private List<Desafio> ListarDesafio() {
        List<Desafio> listDesafio = new ArrayList<>();

        listDesafio.add(new Desafio(
            1,
            "Sistema de Criptografia",
            "Faça um sistema que criptografa a escrita.",
            "/desafio001"
        ));

        return listDesafio;
    }
}
