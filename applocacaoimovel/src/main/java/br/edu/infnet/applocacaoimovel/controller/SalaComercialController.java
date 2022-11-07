package br.edu.infnet.applocacaoimovel.controller;

import br.edu.infnet.applocacaoimovel.model.domain.SalaComercial;
import br.edu.infnet.applocacaoimovel.model.service.SalaComercialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
    public String excluir(@PathVariable Integer id){
        System.out.println("ID: " + id);
        salaComercialService.excluir(id);
        return "redirect:/sala-comercial/lista";
    }

    @GetMapping(value = "/sala-comercial")
    public String cadastrar(){
        return "/sala-comercial/cadastro";
    }

    @PostMapping(value = "/sala-comercial/incluir")
    public String incluir(SalaComercial salaComercial){
        salaComercialService.incluir(salaComercial);
        return "redirect:/sala-comercial/lista";
    }
}
