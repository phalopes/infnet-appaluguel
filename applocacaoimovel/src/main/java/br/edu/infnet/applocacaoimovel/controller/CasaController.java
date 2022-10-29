package br.edu.infnet.applocacaoimovel.controller;

import br.edu.infnet.applocacaoimovel.model.domain.Casa;
import br.edu.infnet.applocacaoimovel.model.domain.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class CasaController {
    private static Map<Integer, Casa> mapa = new HashMap<Integer, Casa>();
    private static Integer id = 1;

    public static void incluir(Casa casa){
        casa.setId(id++);
        mapa.put(casa.getId(), casa);
    }

    public static Collection<Casa> obterLista(){
        return mapa.values();
    }

    @GetMapping(value = "/casa/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", obterLista());

        return "casa/lista";
    }
}
