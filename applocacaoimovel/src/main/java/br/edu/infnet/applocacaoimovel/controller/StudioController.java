package br.edu.infnet.applocacaoimovel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudioController {

    @GetMapping(value = "/studio/lista")
    public String telaLista(){
        return "studio/lista";
    }
}