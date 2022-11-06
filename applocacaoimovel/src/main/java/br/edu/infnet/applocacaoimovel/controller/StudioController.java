package br.edu.infnet.applocacaoimovel.controller;

import br.edu.infnet.applocacaoimovel.model.domain.Studio;
import br.edu.infnet.applocacaoimovel.model.service.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Controller
public class StudioController {
    @Autowired
    private StudioService studioService;

    @GetMapping(value = "/studio/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", studioService.obterLista());

        return "studio/lista";
    }

    @GetMapping(value = "/studio/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        System.out.println("ID: " + id);
        studioService.excluir(id);
        return "redirect:/studio/lista";
    }
}
