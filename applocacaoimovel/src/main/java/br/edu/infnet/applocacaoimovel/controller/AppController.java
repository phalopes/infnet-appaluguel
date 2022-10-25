package br.edu.infnet.applocacaoimovel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class AppController {

    @GetMapping(value = "/")
    public String telaHome(){
        return "home";
    }
}
