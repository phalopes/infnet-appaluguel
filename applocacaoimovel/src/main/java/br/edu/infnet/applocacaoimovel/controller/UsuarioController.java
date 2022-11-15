package br.edu.infnet.applocacaoimovel.controller;

import br.edu.infnet.applocacaoimovel.model.domain.Endereco;
import br.edu.infnet.applocacaoimovel.model.domain.Usuario;
import br.edu.infnet.applocacaoimovel.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/usuario/lista")
    public String telaLista(Model model) throws Exception {

        model.addAttribute("listagem", usuarioService.obterLista());

        return "usuario/lista";
    }

    @GetMapping(value = "/usuario/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        System.out.println("ID: " + id);
        usuarioService.excluir(id);
        return "redirect:/usuario/lista";
    }

    @GetMapping(value = "/usuario/cadastro")
    public String cadastro(){
        return "usuario/cadastro";
    }

    @PostMapping(value = "/usuario/incluir")
    public String incluir(Usuario usuario){
        usuarioService.incluir(usuario);
        return "redirect:/";
    }

    @PostMapping(value = "/cep")
    public String obterCep(Model model, @RequestParam String cep){
        model.addAttribute("endereco", usuarioService.obterCep(cep));
        return "usuario/cadastro";
    }
}
