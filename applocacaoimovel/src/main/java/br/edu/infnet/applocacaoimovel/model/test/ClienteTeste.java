package br.edu.infnet.applocacaoimovel.model.test;

import br.edu.infnet.applocacaoimovel.model.domain.Cliente;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ClienteTeste implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {

        Cliente cl1 = new Cliente();
        cl1.cpf = "123456";
        cl1.nome = "Fulano";
        cl1.telefone = "(11)123-444";
        System.out.println(cl1);

        Cliente cl2 = new Cliente();
        cl2.cpf = "456789";
        cl2.nome = "Siclano";
        cl2.telefone = "(11)789-555";
        System.out.println(cl2);

        Cliente cl3 = new Cliente();
        cl3.cpf = "789123";
        cl3.nome = "Maria";
        cl3.telefone = "(11)456-666";
        System.out.println(cl3);
    }
}
