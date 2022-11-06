package br.edu.infnet.applocacaoimovel.model.service;

import br.edu.infnet.applocacaoimovel.model.domain.SalaComercial;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class SalaComercialService {
    private static Map<Integer, SalaComercial> mapa = new HashMap<Integer, SalaComercial>();
    private static Integer id = 1;

    public void incluir(SalaComercial salaComercial){
        salaComercial.setId(id++);
        mapa.put(salaComercial.getId(), salaComercial);
    }

    public Collection<SalaComercial> obterLista(){
        return mapa.values();
    }

    public void excluir(Integer id){
        mapa.remove(id);
    }
}
