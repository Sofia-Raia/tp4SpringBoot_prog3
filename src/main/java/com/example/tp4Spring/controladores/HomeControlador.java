package com.example.tp4Spring.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControlador {
    @GetMapping("/")//ruta por defecto, que redirige al home.Puerto 8080
    public String home() {
        return "Bienvenido a la API REST de Agenda!";
    }
}
