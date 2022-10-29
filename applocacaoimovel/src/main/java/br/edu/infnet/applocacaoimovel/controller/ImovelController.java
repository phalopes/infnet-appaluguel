package br.edu.infnet.applocacaoimovel.controller;

import br.edu.infnet.applocacaoimovel.model.domain.Imovel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ImovelController {
    private static Map<Integer, Imovel> mapa = new HashMap<Integer, Imovel>();
    private static Integer id = 1;

    public static void incluir(Imovel imovel){
        imovel.setId(id++);
        mapa.put(imovel.getId(), imovel);
    }

    public static Collection<Imovel> obterLista(){
        return mapa.values();
    }
    @GetMapping(value = "/imovel/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", obterLista());

        return "imovel/lista";
    }

    @GetMapping(value = "/imovel/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        System.out.println("ID: " + id);
        mapa.remove(id);
        return "redirect:/imovel/lista";
    }
}
