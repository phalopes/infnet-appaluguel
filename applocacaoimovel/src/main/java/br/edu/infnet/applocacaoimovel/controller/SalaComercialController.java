package br.edu.infnet.applocacaoimovel.controller;

import br.edu.infnet.applocacaoimovel.model.service.SalaComercialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SalaComercialController {
    @Autowired
    private SalaComercialService salaComercialService;

    @GetMapping(value = "/sala-comercial/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", salaComercialService.obterLista());

        return "sala-comercial/lista";
    }

    @GetMapping(value = "/sala-comercial/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        System.out.println("ID: " + id);
        salaComercialService.excluir(id);
        return "redirect:/sala-comercial/lista";
    }
}
