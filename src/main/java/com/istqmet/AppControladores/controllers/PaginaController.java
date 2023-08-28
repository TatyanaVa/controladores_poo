
package com.istqmet.AppControladores.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping ("/productos")
    public String products(){
        return "products";
    }

    @GetMapping ("/contactos")
    public String contactos(){
        return "contactos";
    }

    @GetMapping ("/acerca_de")
    public String acercade(){
        return "acerca_de";
    }

    @GetMapping ("/servicios")
    public  String servicios(){
        return "servicios";
    }
}
