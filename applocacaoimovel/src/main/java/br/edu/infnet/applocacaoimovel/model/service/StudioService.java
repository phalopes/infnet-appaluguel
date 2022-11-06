package br.edu.infnet.applocacaoimovel.model.service;

import br.edu.infnet.applocacaoimovel.model.domain.Studio;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class StudioService {
    private static Map<Integer, Studio> mapa = new HashMap<Integer, Studio>();
    private static Integer id = 1;

    public void incluir(Studio studio){
        studio.setId(id++);
        mapa.put(studio.getId(), studio);
    }

    public Collection<Studio> obterLista(){
        return mapa.values();
    }

    public void excluir(Integer id){
        mapa.remove(id);
    }
}
