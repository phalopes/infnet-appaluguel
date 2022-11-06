package br.edu.infnet.applocacaoimovel.model.service;

import br.edu.infnet.applocacaoimovel.model.domain.Imovel;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ImovelService {
    private static Map<Integer, Imovel> mapa = new HashMap<Integer, Imovel>();
    private static Integer id = 1;

    public void incluir(Imovel imovel){
        imovel.setId(id++);
        mapa.put(imovel.getId(), imovel);
    }

    public Collection<Imovel> obterLista(){
        return mapa.values();
    }

    public void excluir(Integer id) {
        mapa.remove(id);
    }
}
