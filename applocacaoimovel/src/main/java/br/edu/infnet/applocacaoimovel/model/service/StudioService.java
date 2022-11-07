package br.edu.infnet.applocacaoimovel.model.service;

import br.edu.infnet.applocacaoimovel.model.domain.Studio;
import br.edu.infnet.applocacaoimovel.model.repository.StudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudioService {
    @Autowired
    private StudioRepository studioRepository;

    public void incluir(Studio studio){
        studioRepository.save(studio);
    }

    public Collection<Studio> obterLista(){
        return (Collection<Studio>) studioRepository.findAll();
    }

    public void excluir(Integer id){
        studioRepository.deleteById(id);
    }
}
