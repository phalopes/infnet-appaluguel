package br.edu.infnet.applocacaoimovel;

import br.edu.infnet.applocacaoimovel.model.domain.Aluguel;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AluguelTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("## Aluguel ##");

        Aluguel al1 = new Aluguel();
        al1.setInicio(LocalDateTime.of(2022, 12, 25, 0, 0));
        al1.setPeriodo(30);
        al1.setWeb(false);
        System.out.println(al1);

        Aluguel al2 = new Aluguel();
        al2.setInicio(LocalDateTime.of(2023, 12, 25, 0, 0));
        al2.setPeriodo(30);
        al2.setWeb(true);
        System.out.println(al2);

        Aluguel al3 = new Aluguel();
        al3.setInicio(LocalDateTime.of(2022, 12, 25, 0, 0));
        al3.setPeriodo(12);
        al3.setWeb(false);
        System.out.println(al3);
    }
}
