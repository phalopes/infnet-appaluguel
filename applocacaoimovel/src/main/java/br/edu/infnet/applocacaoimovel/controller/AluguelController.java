package br.edu.infnet.applocacaoimovel.controller;

import br.edu.infnet.applocacaoimovel.model.domain.Aluguel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AluguelController {
    private static Map<Integer, Aluguel> mapa = new HashMap<Integer, Aluguel>();
    private static Integer id = 1;

    public static void incluir(Aluguel aluguel){
        aluguel.setId(id++);
        mapa.put(aluguel.getId(), aluguel);
    }

    public static Collection<Aluguel> obterLista(){
        return mapa.values();
    }

    @GetMapping(value = "/aluguel/lista")
    public String telaLista(Model model) throws Exception {

        model.addAttribute("listagem", obterLista());

        return "aluguel/lista";
    }
}
