package br.edu.infnet.applocacaoimovel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CasaController {

    @GetMapping(value = "/casa/lista")
    public String telaLista(){
        return "casa/lista";
    }
}
