package br.edu.infnet.applocacaoimovel;

import br.edu.infnet.applocacaoimovel.model.domain.*;
import br.edu.infnet.applocacaoimovel.model.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(6)
@Component
public class ImovelTeste implements ApplicationRunner {
    @Autowired
    private ImovelService imovelService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setId(1);

        Imovel slc1 = new SalaComercial();
        slc1.setValor(1234.3f);
        slc1.setEndereco("Rua 1");
        slc1.setAcessivel(false);
        slc1.setMetragem(45.5f);
        slc1.setCodigo("SLC4551");
        slc1.setUsuario(usuario);
        System.out.println("SalaComercial " + slc1);
        imovelService.incluir(slc1);

        Imovel std1 = new Studio();
        std1.setValor(1234.3f);
        std1.setEndereco("Rua 1");
        std1.setAcessivel(false);
        std1.setMetragem(45.5f);
        std1.setCodigo("STD4551");
        std1.setUsuario(usuario);
        System.out.println("Studio " + std1);
        imovelService.incluir(std1);

        Imovel cs1 = new Casa();
        cs1.setValor(1234.3f);
        cs1.setEndereco("Rua 1");
        cs1.setAcessivel(false);
        cs1.setMetragem(45.5f);
        cs1.setCodigo("CS4551");
        cs1.setUsuario(usuario);
        System.out.println("Casa " + cs1);
        imovelService.incluir(cs1);
    }
}
