package br.edu.infnet.applocacaoimovel.model.test;

import br.edu.infnet.applocacaoimovel.model.domain.Casa;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CasaTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Casa cs1 = new Casa();
        cs1.valor = 1234.3f;
        cs1.endereco = "Rua 1";
        cs1.acessivel = false;
        cs1.metragem = 45.5f;
        cs1.codigo = 4551;
        cs1.quartos = 2;
        cs1.quintal = false;
        cs1.cor = "Laranja";
        System.out.println("Casa " + cs1);

        Casa cs2 = new Casa();
        cs2.valor = 4567.3f;
        cs2.endereco = "Rua 2";
        cs2.acessivel = true;
        cs2.metragem = 95.5f;
        cs2.codigo = 7895;
        cs2.quartos = 4;
        cs2.quintal = true;
        cs2.cor = "Branco";
        System.out.println("Casa " + cs2);

        Casa cs3 = new Casa();
        cs3.valor = 8012.3f;
        cs3.endereco = "Rua 1";
        cs3.acessivel = true;
        cs3.metragem = 205.5f;
        cs3.codigo = 551;
        cs3.quartos = 3;
        cs3.quintal = true;
        cs3.cor = "Verde";
        System.out.println("Casa " + cs3);
    }
}
