package br.edu.infnet.applocacaoimovel.model.service;

import br.edu.infnet.applocacaoimovel.model.domain.Casa;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CasaService {
    private static Map<Integer, Casa> mapa = new HashMap<Integer, Casa>();
    private static Integer id = 1;

    public void incluir(Casa casa){
        casa.setId(id++);
        mapa.put(casa.getId(), casa);
    }

    public Collection<Casa> obterLista(){
        return mapa.values();
    }

    public void excluir(Integer id){
        mapa.remove(id);
    }
}
