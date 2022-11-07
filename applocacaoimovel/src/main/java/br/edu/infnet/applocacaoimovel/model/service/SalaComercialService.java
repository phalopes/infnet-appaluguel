package br.edu.infnet.applocacaoimovel.model.service;

import br.edu.infnet.applocacaoimovel.model.domain.SalaComercial;
import br.edu.infnet.applocacaoimovel.model.repository.SalaComercialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SalaComercialService {
    @Autowired
    private SalaComercialRepository salaComercialRepository;

    public void incluir(SalaComercial salaComercial){
        salaComercialRepository.save(salaComercial);
    }

    public Collection<SalaComercial> obterLista(){
        return (Collection<SalaComercial>) salaComercialRepository.findAll();
    }

    public void excluir(Integer id){
        salaComercialRepository.deleteById(id);
    }
}
