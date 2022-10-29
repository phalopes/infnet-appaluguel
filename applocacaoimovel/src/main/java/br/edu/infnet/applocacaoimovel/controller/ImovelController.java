package br.edu.infnet.applocacaoimovel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ImovelController {

    @GetMapping(value = "/imovel/lista")
    public String telaLista(){
        return "imovel/lista";
    }
}
