package br.edu.infnet.applocacaoimovel;

import br.edu.infnet.applocacaoimovel.model.domain.SalaComercial;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SalaComercialTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("## Sala Comercial ##");

        SalaComercial slc1 = new SalaComercial();
        slc1.setValor(1234.3f);
        slc1.setEndereco("Rua 1");
        slc1.setAcessivel(false);
        slc1.setMetragem(45.5f);
        slc1.setCodigo("SLC4551");
        slc1.setRecepcao(true);
        slc1.setElevadores(2);
        slc1.setCondominio(350.0f);
        System.out.println("SalaComercial " + slc1);

        SalaComercial slc2 = new SalaComercial();
        slc2.setValor(4500.0f);
        slc2.setEndereco("Rua Faria Lima");
        slc2.setAcessivel(true);
        slc2.setMetragem(95.5f);
        slc2.setCodigo("SLC7895");
        slc2.setRecepcao(true);
        slc2.setElevadores(2);
        slc2.setCondominio(350.0f);
        System.out.println("SalaComercial " + slc2);

        SalaComercial slc3 = new SalaComercial();
        slc3.setValor(1050.0f);
        slc3.setEndereco("Rua 78");
        slc3.setAcessivel(false);
        slc3.setMetragem(25.0f);
        slc3.setCodigo("SLC5548");
        slc3.setRecepcao(true);
        slc3.setElevadores(2);
        slc3.setCondominio(650.0f);
        System.out.println("SalaComercial " + slc3);
    }
}
