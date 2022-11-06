package br.edu.infnet.applocacaoimovel.model.service;

import br.edu.infnet.applocacaoimovel.model.domain.Casa;
import br.edu.infnet.applocacaoimovel.model.repository.CasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CasaService {
    @Autowired
    private CasaRepository casaRepository;

    public void incluir(Casa casa){
        casaRepository.save(casa);
    }

    public Collection<Casa> obterLista(){
        return (Collection<Casa>) casaRepository.findAll();
    }

    public void excluir(Integer id){
        casaRepository.deleteById(id);
    }
}
