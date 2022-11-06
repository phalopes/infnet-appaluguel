package br.edu.infnet.applocacaoimovel.model.service;

import br.edu.infnet.applocacaoimovel.model.domain.Imovel;
import br.edu.infnet.applocacaoimovel.model.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ImovelService {
    @Autowired
    private ImovelRepository imovelRepository;

    public void incluir(Imovel imovel){
        imovelRepository.save(imovel);
    }

    public Collection<Imovel> obterLista(){
        return (Collection<Imovel>) imovelRepository.findAll();
    }

    public void excluir(Integer id) {
        imovelRepository.deleteById(id);
    }
}
