package br.edu.infnet.applocacaoimovel;

import br.edu.infnet.applocacaoimovel.model.domain.Cliente;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ClienteTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("## Cliente ##");

        Cliente cl1 = new Cliente("Cliente 1", "12345678912", "(11)123-444");
        System.out.println(cl1);

        Cliente cl2 = new Cliente("Siclano", "45678912341", "(11)789-555");
        System.out.println(cl2);

        Cliente cl3 = new Cliente("Maria", "45678912341", "(11)789-444");
        System.out.println(cl3);
    }
}
