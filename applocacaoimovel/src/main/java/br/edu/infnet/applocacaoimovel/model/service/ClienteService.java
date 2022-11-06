package br.edu.infnet.applocacaoimovel.model.service;

import br.edu.infnet.applocacaoimovel.model.domain.Cliente;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ClienteService {
    private static Map<Integer, Cliente> mapa = new HashMap<Integer, Cliente>();
    private static Integer id = 1;

    public void incluir(Cliente cliente){
        cliente.setId(id++);
        mapa.put(cliente.getId(), cliente);
    }

    public Collection<Cliente> obterLista(){
        return mapa.values();
    }

    public void excluir(Integer id) {
        mapa.remove(id);
    }
}
