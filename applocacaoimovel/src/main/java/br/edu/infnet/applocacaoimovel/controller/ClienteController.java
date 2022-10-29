package br.edu.infnet.applocacaoimovel.controller;

import br.edu.infnet.applocacaoimovel.model.domain.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ClienteController {

    @GetMapping(value = "/cliente/lista")
    public String telaLista(Model model) throws Exception {
        Cliente cl1 = new Cliente("Fulano", "12345678901", "(11)123-444");

        Cliente cl2 = new Cliente("Siclano", "45678912341", "(11)789-555");

        Cliente cl3 = new Cliente("Maria", "78912312345", "(11)456-666");

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cl1);
        clientes.add(cl2);
        clientes.add(cl3);

        model.addAttribute("listagem", clientes);

        return "cliente/lista";
    }
}
