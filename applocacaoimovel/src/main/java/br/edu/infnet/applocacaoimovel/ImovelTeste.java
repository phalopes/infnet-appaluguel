package br.edu.infnet.applocacaoimovel;

import br.edu.infnet.applocacaoimovel.controller.ImovelController;
import br.edu.infnet.applocacaoimovel.model.domain.Casa;
import br.edu.infnet.applocacaoimovel.model.domain.Imovel;
import br.edu.infnet.applocacaoimovel.model.domain.SalaComercial;
import br.edu.infnet.applocacaoimovel.model.domain.Studio;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ImovelTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Imovel slc1 = new SalaComercial();
        slc1.setValor(1234.3f);
        slc1.setEndereco("Rua 1");
        slc1.setAcessivel(false);
        slc1.setMetragem(45.5f);
        slc1.setCodigo("SLC4551");
        System.out.println("SalaComercial " + slc1);
        ImovelController.incluir(slc1);

        Imovel std1 = new Studio();
        std1.setValor(1234.3f);
        std1.setEndereco("Rua 1");
        std1.setAcessivel(false);
        std1.setMetragem(45.5f);
        std1.setCodigo("STD4551");
        System.out.println("Studio " + std1);
        ImovelController.incluir(std1);

        Imovel cs1 = new Casa();
        cs1.setValor(1234.3f);
        cs1.setEndereco("Rua 1");
        cs1.setAcessivel(false);
        cs1.setMetragem(45.5f);
        cs1.setCodigo("CS4551");
        System.out.println("Casa " + cs1);
        ImovelController.incluir(cs1);
    }
}
