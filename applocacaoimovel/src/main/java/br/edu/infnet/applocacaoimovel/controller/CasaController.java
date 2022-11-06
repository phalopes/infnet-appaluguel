package br.edu.infnet.applocacaoimovel.controller;

import br.edu.infnet.applocacaoimovel.model.service.CasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CasaController {
    @Autowired
    private CasaService casaService;

    @GetMapping(value = "/casa/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", casaService.obterLista());

        return "casa/lista";
    }

    @GetMapping(value = "/casa/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        System.out.println("ID: " + id);
        casaService.excluir(id);
        return "redirect:/casa/lista";
    }
}
