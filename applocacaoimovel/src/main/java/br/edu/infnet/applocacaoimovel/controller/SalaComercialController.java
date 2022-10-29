package br.edu.infnet.applocacaoimovel.controller;

import br.edu.infnet.applocacaoimovel.model.domain.SalaComercial;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Controller
public class SalaComercialController {
    private static Map<Integer, SalaComercial> mapa = new HashMap<Integer, SalaComercial>();
    private static Integer id = 1;

    public static void incluir(SalaComercial salaComercial){
        salaComercial.setId(id++);
        mapa.put(salaComercial.getId(), salaComercial);
    }

    public static Collection<SalaComercial> obterLista(){
        return mapa.values();
    }

    @GetMapping(value = "/sala-comercial/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", obterLista());

        return "sala-comercial/lista";
    }

    @GetMapping(value = "/sala-comercial/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        System.out.println("ID: " + id);
        mapa.remove(id);
        return "redirect:/sala-comercial/lista";
    }
}
