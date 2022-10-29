package br.edu.infnet.applocacaoimovel;

import br.edu.infnet.applocacaoimovel.controller.StudioController;
import br.edu.infnet.applocacaoimovel.model.domain.Studio;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StudioTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("## Studio ##");

        Studio std1 = new Studio();
        std1.setValor(1234.3f);
        std1.setEndereco("Rua 1");
        std1.setAcessivel(false);
        std1.setMetragem(45.5f);
        std1.setCodigo("STD4551");
        std1.setAndar(2);
        std1.setPortaria(false);
        std1.setCondominio(350.0f);
        System.out.println("Studio " + std1);
        StudioController.incluir(std1);

        Studio std2 = new Studio();
        std2.setValor(4567.3f);
        std2.setEndereco("Rua Faria Lima");
        std2.setAcessivel(true);
        std2.setMetragem(95.5f);
        std2.setCodigo("STD7895");
        std2.setAndar(16);
        std2.setPortaria(true);
        std2.setCondominio(350.0f);
        System.out.println("Studio " + std2);
        StudioController.incluir(std2);

        Studio std3 = new Studio();
        std3.setValor(1012.0f);
        std3.setEndereco("Rua 78");
        std3.setAcessivel(false);
        std3.setMetragem(25.0f);
        std3.setCodigo("STD5548");
        std3.setAndar(9);
        std3.setPortaria(true);
        std3.setCondominio(650.0f);
        System.out.println("Studio " + std3);
        StudioController.incluir(std3);
    }
}
