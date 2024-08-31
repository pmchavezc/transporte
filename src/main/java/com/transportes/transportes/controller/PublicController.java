package com.transportes.transportes.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
@RequiredArgsConstructor


public class PublicController {
    @GetMapping("/home")
    public String home() {
        return "Bienvenido a la página de inicio public home este no necesita loguearse para pode ingresar ";
    }
}
