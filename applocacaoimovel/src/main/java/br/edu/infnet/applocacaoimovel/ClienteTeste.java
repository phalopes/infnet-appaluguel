package br.edu.infnet.applocacaoimovel;

import br.edu.infnet.applocacaoimovel.model.domain.Cliente;
import br.edu.infnet.applocacaoimovel.model.domain.Usuario;
import br.edu.infnet.applocacaoimovel.model.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class ClienteTeste implements ApplicationRunner {
    @Autowired
    private ClienteService clienteService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("## Cliente ##");

        Usuario usr = new Usuario();
        usr.setId(1);

        Cliente cl1 = new Cliente("Cliente 1", "12345678912", "(11)123-444");
        cl1.setUsuario(usr);
        System.out.println(cl1);
        clienteService.incluir(cl1);

        Cliente cl2 = new Cliente("Siclano", "45678912341", "(11)789-555");
        cl2.setUsuario(usr);
        System.out.println(cl2);
        clienteService.incluir(cl2);

        Cliente cl3 = new Cliente("Maria", "45678912341", "(11)789-444");
        cl3.setUsuario(usr);
        System.out.println(cl3);
        clienteService.incluir(cl3);
    }
}
