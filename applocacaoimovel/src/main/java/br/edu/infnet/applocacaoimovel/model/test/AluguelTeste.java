package br.edu.infnet.applocacaoimovel.model.test;

import br.edu.infnet.applocacaoimovel.model.domain.Aluguel;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AluguelTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Aluguel al1 = new Aluguel();
        al1.inicio = LocalDateTime.of(2022, 12, 25, 0, 0);
        al1.periodo = 30;
        al1.web = false;
        System.out.println(al1);

        Aluguel al2 = new Aluguel();
        al2.inicio = LocalDateTime.of(2023, 12, 25, 0, 0);
        al2.periodo = 30;
        al2.web = true;
        System.out.println(al2);

        Aluguel al3 = new Aluguel();
        al3.inicio = LocalDateTime.of(2022, 12, 25, 0, 0);
        al3.periodo = 12;
        al3.web = false;
        System.out.println(al3);
    }
}
