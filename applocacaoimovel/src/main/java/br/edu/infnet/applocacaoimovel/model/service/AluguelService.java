package br.edu.infnet.applocacaoimovel.model.service;

import br.edu.infnet.applocacaoimovel.model.domain.Aluguel;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AluguelService {
    private static Map<Integer, Aluguel> mapa = new HashMap<Integer, Aluguel>();
    private static Integer id = 1;

    public void incluir(Aluguel aluguel){
        aluguel.setId(id++);
        mapa.put(aluguel.getId(), aluguel);
    }

    public Collection<Aluguel> obterLista(){
        return mapa.values();
    }

    public void excluir(Integer id) {
        mapa.remove(id);
    }
}
