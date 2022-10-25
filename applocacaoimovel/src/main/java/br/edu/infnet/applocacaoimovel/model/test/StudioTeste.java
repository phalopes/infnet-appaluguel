package br.edu.infnet.applocacaoimovel.model.test;

import br.edu.infnet.applocacaoimovel.model.domain.Studio;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StudioTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {

        Studio std1 = new Studio();
        std1.valor = 1234.3f;
        std1.endereco = "Rua 1";
        std1.acessivel = false;
        std1.metragem = 45.5f;
        std1.codigo = 4551;
        std1.andar = 2;
        std1.portaria = false;
        std1.condominio = 350.0f;
        System.out.println("Studio " + std1);

        Studio std2 = new Studio();
        std2.valor = 4567.3f;
        std2.endereco = "Rua Faria Lima";
        std2.acessivel = true;
        std2.metragem = 95.5f;
        std2.codigo = 7895;
        std2.andar = 16;
        std2.portaria = true;
        std2.condominio = 350.0f;
        System.out.println("Studio " + std2);

        Studio std3 = new Studio();
        std3.valor = 1012.0f;
        std3.endereco = "Rua 78";
        std3.acessivel = false;
        std3.metragem = 25.0f;
        std3.codigo = 5548;
        std3.andar = 9;
        std3.portaria = true;
        std3.condominio = 650.0f;
        System.out.println("Studio " + std3);
    }
}
