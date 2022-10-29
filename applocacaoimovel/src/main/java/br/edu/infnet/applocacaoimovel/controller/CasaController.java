package br.edu.infnet.applocacaoimovel.controller;

import br.edu.infnet.applocacaoimovel.model.domain.Casa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CasaController {

    @GetMapping(value = "/casa/lista")
    public String telaLista(Model model){
        Casa cs1 = new Casa();
        cs1.setValor(1234.3f);
        cs1.setEndereco("Rua 1");
        cs1.setAcessivel(false);
        cs1.setMetragem(45.5f);
        cs1.setCodigo("CS4551");
        cs1.setQuartos(2);
        cs1.setQuintal(false);
        cs1.setCor("Laranja");

        Casa cs2 = new Casa();
        cs2.setValor(4567.3f);
        cs2.setEndereco("Rua 2");
        cs2.setAcessivel(true);
        cs2.setMetragem(95.5f);
        cs2.setCodigo("CS7895");
        cs2.setQuartos(4);
        cs2.setQuintal(true);
        cs2.setCor("Branco");

        Casa cs3 = new Casa();
        cs3.setValor(8012.3f);
        cs3.setEndereco("Rua 1");
        cs3.setAcessivel(true);
        cs3.setMetragem(205.5f);
        cs3.setCodigo("CS551");
        cs3.setQuartos(3);
        cs3.setQuintal(true);
        cs3.setCor("Verde");

        List<Casa> casas = new ArrayList<Casa>();
        casas.add(cs1);
        casas.add(cs2);
        casas.add(cs3);

        model.addAttribute("listagem", casas);

        return "casa/lista";
    }
}
