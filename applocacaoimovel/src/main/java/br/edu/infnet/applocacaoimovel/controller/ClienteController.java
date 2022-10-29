package br.edu.infnet.applocacaoimovel.controller;

import br.edu.infnet.applocacaoimovel.model.domain.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ClienteController {
    private static Map<Integer, Cliente> mapa = new HashMap<Integer, Cliente>();
    private static Integer id = 1;

    public static void incluir(Cliente cliente){
        cliente.setId(id++);
        mapa.put(cliente.getId(), cliente);
    }

    public static Collection<Cliente> obterLista(){
        return mapa.values();
    }
    @GetMapping(value = "/cliente/lista")
    public String telaLista(Model model) throws Exception {

        model.addAttribute("listagem", obterLista());

        return "cliente/lista";
    }
}
