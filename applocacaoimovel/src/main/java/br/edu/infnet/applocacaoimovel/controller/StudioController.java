package br.edu.infnet.applocacaoimovel.controller;

import br.edu.infnet.applocacaoimovel.model.domain.Studio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Controller
public class StudioController {
    private static Map<Integer, Studio> mapa = new HashMap<Integer, Studio>();
    private static Integer id = 1;

    public static void incluir(Studio studio){
        studio.setId(id++);
        mapa.put(studio.getId(), studio);
    }

    public static Collection<Studio> obterLista(){
        return mapa.values();
    }

    @GetMapping(value = "/studio/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", obterLista());

        return "studio/lista";
    }

    @GetMapping(value = "/studio/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        System.out.println("ID: " + id);
        mapa.remove(id);
        return "redirect:/studio/lista";
    }
}
