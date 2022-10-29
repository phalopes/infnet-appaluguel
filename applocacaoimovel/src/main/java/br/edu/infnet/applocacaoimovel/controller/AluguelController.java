package br.edu.infnet.applocacaoimovel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AluguelController {

    @GetMapping(value = "/aluguel/lista")
    public String telaLista(){
        return "aluguel/lista";
    }
}
