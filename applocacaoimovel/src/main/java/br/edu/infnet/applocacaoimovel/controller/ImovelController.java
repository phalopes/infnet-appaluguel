package br.edu.infnet.applocacaoimovel.controller;

import br.edu.infnet.applocacaoimovel.model.domain.Usuario;
import br.edu.infnet.applocacaoimovel.model.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class ImovelController {
    @Autowired
    private ImovelService imovelService;

    @GetMapping(value = "/imovel/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){

        model.addAttribute("listagem", imovelService.obterLista(usuario));

        return "imovel/lista";
    }

    @GetMapping(value = "/imovel/{id}/excluir")
    public String excluir(@PathVariable Integer id){
        System.out.println("ID: " + id);
        imovelService.excluir(id);
        return "redirect:/imovel/lista";
    }
}
