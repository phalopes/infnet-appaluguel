package br.edu.infnet.applocacaoimovel.model.service;

import br.edu.infnet.applocacaoimovel.model.domain.Cliente;
import br.edu.infnet.applocacaoimovel.model.domain.Usuario;
import br.edu.infnet.applocacaoimovel.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public void incluir(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public Collection<Cliente> obterLista(){
        return (Collection<Cliente>) clienteRepository.findAll();
    }

    public Collection<Cliente> obterListaDoUsuario(Usuario usuario){
        return (Collection<Cliente>) clienteRepository.obterLista(usuario.getId());
    }

    public void excluir(Integer id) {
        clienteRepository.deleteById(id);
    }
}
