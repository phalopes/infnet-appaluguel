package br.edu.infnet.applocacaoimovel;

import br.edu.infnet.applocacaoimovel.model.domain.Usuario;
import br.edu.infnet.applocacaoimovel.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class UsuarioTeste implements ApplicationRunner {
    @Autowired
    private UsuarioService usuarioService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("## Usuario ##");

        Usuario cl1 = new Usuario("Usuario 1", "asd@asd.com", "123456");
        System.out.println(cl1);
        usuarioService.incluir(cl1);

        Usuario cl2 = new Usuario("Siclano", "email@dominio.com", "mudar123");
        System.out.println(cl2);
        usuarioService.incluir(cl2);

        Usuario cl3 = new Usuario("Maria", "rj@sc.sp", "123Mudar");
        System.out.println(cl3);
        usuarioService.incluir(cl3);
    }
}
