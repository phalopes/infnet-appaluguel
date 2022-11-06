package br.edu.infnet.applocacaoimovel;

import br.edu.infnet.applocacaoimovel.model.domain.Casa;
import br.edu.infnet.applocacaoimovel.model.service.CasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CasaTeste implements ApplicationRunner {
    @Autowired
    private CasaService casaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("## Casa ##");
        Casa cs1 = new Casa();
        cs1.setValor(1234.3f);
        cs1.setEndereco("Rua 1");
        cs1.setAcessivel(false);
        cs1.setMetragem(45.5f);
        cs1.setCodigo("CS4551");
        cs1.setQuartos(2);
        cs1.setQuintal(false);
        cs1.setCor("Laranja");
        System.out.println("Casa " + cs1);
        casaService.incluir(cs1);

        Casa cs2 = new Casa();
        cs2.setValor(4567.3f);
        cs2.setEndereco("Rua 2");
        cs2.setAcessivel(true);
        cs2.setMetragem(95.5f);
        cs2.setCodigo("CS7895");
        cs2.setQuartos(4);
        cs2.setQuintal(true);
        cs2.setCor("Branco");
        System.out.println("Casa " + cs2);
        casaService.incluir(cs2);

        Casa cs3 = new Casa();
        cs3.setValor(8012.3f);
        cs3.setEndereco("Rua 1");
        cs3.setAcessivel(true);
        cs3.setMetragem(205.5f);
        cs3.setCodigo("CS551");
        cs3.setQuartos(3);
        cs3.setQuintal(true);
        cs3.setCor("Verde");
        System.out.println("Casa " + cs3);
        casaService.incluir(cs3);
    }
}
