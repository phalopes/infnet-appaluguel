package br.edu.infnet.applocacaoimovel.controller;

import br.edu.infnet.applocacaoimovel.model.domain.Aluguel;
import br.edu.infnet.applocacaoimovel.model.domain.Usuario;
import br.edu.infnet.applocacaoimovel.model.service.AluguelService;
import br.edu.infnet.applocacaoimovel.model.service.ClienteService;
import br.edu.infnet.applocacaoimovel.model.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class AluguelController {
    @Autowired
    private AluguelService aluguelService;
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private ImovelService imovelService;

    @GetMapping(value = "/aluguel/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("listagem", aluguelService.obterLista(usuario));

        return "aluguel/lista";
    }

    @GetMapping(value = "/aluguel/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        System.out.println("ID: " + id);
        aluguelService.excluir(id);
        return "redirect:/aluguel/lista";
    }

    @GetMapping(value = "/aluguel")
    public String cadastrar(Model model, @SessionAttribute("user") Usuario usuario){
        model.addAttribute("clientes", clienteService.obterListaDoUsuario(usuario));
        model.addAttribute("imoveis", imovelService.obterLista(usuario));
        return "/aluguel/cadastro";
    }

    @PostMapping(value = "/aluguel/incluir")
    public String incluir(Aluguel aluguel, @SessionAttribute("user") Usuario usuario){
        aluguel.setUsuario(usuario);
        aluguelService.incluir(aluguel);
        return "redirect:/aluguel/lista";
    }
}
