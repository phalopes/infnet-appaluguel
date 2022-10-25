package br.edu.infnet.applocacaoimovel.model.test;

import br.edu.infnet.applocacaoimovel.model.domain.SalaComercial;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SalaComercialTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {

        SalaComercial slc1 = new SalaComercial();
        slc1.valor = 1234.3f;
        slc1.endereco = "Rua 1";
        slc1.acessivel = false;
        slc1.metragem = 45.5f;
        slc1.codigo = 4551;
        slc1.recepcao = true;
        slc1.elevadores = 2;
        slc1.condominio = 350.0f;
        System.out.println("SalaComercial " + slc1);

        SalaComercial slc2 = new SalaComercial();
        slc2.valor = 4500.0f;
        slc2.endereco = "Rua Faria Lima";
        slc2.acessivel = true;
        slc2.metragem = 95.5f;
        slc2.codigo = 7895;
        slc2.recepcao = true;
        slc2.elevadores = 2;
        slc2.condominio = 350.0f;
        System.out.println("SalaComercial " + slc2);

        SalaComercial slc3 = new SalaComercial();
        slc3.valor = 1050.0f;
        slc3.endereco = "Rua 78";
        slc3.acessivel = false;
        slc3.metragem = 25.0f;
        slc3.codigo = 5548;
        slc3.recepcao = true;
        slc3.elevadores = 2;
        slc3.condominio = 650.0f;
        System.out.println("SalaComercial " + slc3);
    }
}
