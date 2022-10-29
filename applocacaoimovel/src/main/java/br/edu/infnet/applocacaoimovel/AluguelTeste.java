package br.edu.infnet.applocacaoimovel;

import br.edu.infnet.applocacaoimovel.model.domain.Aluguel;
import br.edu.infnet.applocacaoimovel.model.domain.Cliente;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AluguelTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("## Aluguel ##");

        Cliente cl1 = new Cliente("Cliente 1", "123456", "(11)123-444");
        Cliente cl2 = new Cliente("Cliente 2", "456789", "(11)789-444");

        Aluguel al1 = new Aluguel(cl1);
        System.out.println(al1);

        Aluguel al2 = new Aluguel();
        al2.setInicio(LocalDateTime.of(2023, 12, 25, 0, 0));
        al2.setPeriodo(24);
        al2.setCliente(cl1);
        System.out.println(al2);

        Aluguel al3 = new Aluguel();
        al3.setInicio(LocalDateTime.of(2022, 12, 25, 0, 0));
        al3.setWeb(false);
        al3.setCliente(cl2);
        System.out.println(al3);
    }
}
