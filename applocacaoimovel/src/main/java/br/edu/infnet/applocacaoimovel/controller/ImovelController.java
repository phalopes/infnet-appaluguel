package br.edu.infnet.applocacaoimovel.controller;

import br.edu.infnet.applocacaoimovel.model.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ImovelController {
    @Autowired
    private ImovelService imovelService;

    @GetMapping(value = "/imovel/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", imovelService.obterLista());

        return "imovel/lista";
    }

    @GetMapping(value = "/imovel/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        System.out.println("ID: " + id);
        imovelService.excluir(id);
        return "redirect:/imovel/lista";
    }
}
