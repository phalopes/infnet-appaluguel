package br.edu.infnet.applocacaoimovel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SalaComercialController {

    @GetMapping(value = "/sala-comercial/lista")
    public String telaLista(){
        return "sala-comercial/lista";
    }
}
