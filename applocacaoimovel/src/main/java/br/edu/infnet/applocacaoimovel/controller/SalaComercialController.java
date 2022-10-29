package br.edu.infnet.applocacaoimovel.controller;

import br.edu.infnet.applocacaoimovel.model.domain.SalaComercial;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SalaComercialController {

    @GetMapping(value = "/sala-comercial/lista")
    public String telaLista(Model model){

        SalaComercial slc1 = new SalaComercial();
        slc1.setValor(1234.3f);
        slc1.setEndereco("Rua 1");
        slc1.setAcessivel(false);
        slc1.setMetragem(45.5f);
        slc1.setCodigo(4551);
        slc1.setRecepcao(true);
        slc1.setElevadores(2);
        slc1.setCondominio(350.0f);

        SalaComercial slc2 = new SalaComercial();
        slc2.setValor(4500.0f);
        slc2.setEndereco("Rua Faria Lima");
        slc2.setAcessivel(true);
        slc2.setMetragem(95.5f);
        slc2.setCodigo(7895);
        slc2.setRecepcao(true);
        slc2.setElevadores(2);
        slc2.setCondominio(350.0f);

        SalaComercial slc3 = new SalaComercial();
        slc3.setValor(1050.0f);
        slc3.setEndereco("Rua 78");
        slc3.setAcessivel(false);
        slc3.setMetragem(25.0f);
        slc3.setCodigo(5548);
        slc3.setRecepcao(true);
        slc3.setElevadores(2);
        slc3.setCondominio(650.0f);

        List<SalaComercial> salasComerciais = new ArrayList<SalaComercial>();

        salasComerciais.add(slc1);
        salasComerciais.add(slc2);
        salasComerciais.add(slc3);

        model.addAttribute("listagem", salasComerciais);

        return "sala-comercial/lista";
    }
}
