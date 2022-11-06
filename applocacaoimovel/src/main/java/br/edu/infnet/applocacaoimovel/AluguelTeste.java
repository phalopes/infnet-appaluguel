package br.edu.infnet.applocacaoimovel;

import br.edu.infnet.applocacaoimovel.model.domain.*;
import br.edu.infnet.applocacaoimovel.model.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class AluguelTeste implements ApplicationRunner {
    @Autowired
    private AluguelService aluguelService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("## Aluguel ##");

        // CLIENTES

        Cliente cl1 = new Cliente("Cliente 1", "12345678912", "(11)123-444");
        Cliente cl2 = new Cliente("Cliente 2", "45678912341", "(11)789-444");

        // IMOVEIS
        Studio std1 = new Studio();
        std1.setValor(1234.3f);
        std1.setEndereco("Rua 1");
        std1.setAcessivel(false);
        std1.setMetragem(45.5f);
        std1.setCodigo("STD002");
        std1.setAndar(2);
        std1.setPortaria(false);
        std1.setCondominio(350.0f);

        Casa cs1 = new Casa();
        cs1.setValor(1234.3f);
        cs1.setEndereco("Rua 1");
        cs1.setAcessivel(false);
        cs1.setMetragem(45.5f);
        cs1.setCodigo("CS456");
        cs1.setQuartos(2);
        cs1.setQuintal(false);
        cs1.setCor("Laranja");

        SalaComercial slc1 = new SalaComercial();
        slc1.setValor(1234.3f);
        slc1.setEndereco("Rua 1");
        slc1.setAcessivel(false);
        slc1.setMetragem(45.5f);
        slc1.setCodigo("SLC106");
        slc1.setRecepcao(true);
        slc1.setElevadores(2);
        slc1.setCondominio(350.0f);

        List<Imovel> imoveisPrimeiroPedido = new ArrayList<>();
        imoveisPrimeiroPedido.add(std1);
        imoveisPrimeiroPedido.add(cs1);

        List<Imovel> imoveisSegundoPedido = new ArrayList<>();
        imoveisSegundoPedido.add(slc1);

        List<Imovel> imoveisTerceiroPedido = new ArrayList<>();
        imoveisTerceiroPedido.add(std1);
        imoveisTerceiroPedido.add(slc1);
        imoveisTerceiroPedido.add(cs1);

        // ALUGUEIS

        Aluguel al1 = new Aluguel(cl1);
        al1.setImoveis(imoveisPrimeiroPedido);
        System.out.println(al1);
        aluguelService.incluir(al1);

        Aluguel al2 = new Aluguel();
        al2.setDataInicio(LocalDate.of(2023, 12, 25));
        al2.setPeriodo(24);
        al2.setCliente(cl1);
        al2.setImoveis(imoveisSegundoPedido);
        System.out.println(al2);
        aluguelService.incluir(al2);

        Aluguel al3 = new Aluguel();
        al3.setDataInicio(LocalDate.of(2022, 12, 25));
        al3.setWeb(false);
        al3.setCliente(cl2);
        al3.setImoveis(imoveisTerceiroPedido);
        System.out.println(al3);
        aluguelService.incluir(al3);
    }
}
