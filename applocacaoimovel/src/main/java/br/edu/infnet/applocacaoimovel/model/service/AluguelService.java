package br.edu.infnet.applocacaoimovel.model.service;

import br.edu.infnet.applocacaoimovel.model.domain.Aluguel;
import br.edu.infnet.applocacaoimovel.model.domain.Usuario;
import br.edu.infnet.applocacaoimovel.model.repository.AluguelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AluguelService {
    @Autowired
    private AluguelRepository aluguelRepository;

    public void incluir(Aluguel aluguel){
        aluguelRepository.save(aluguel);
    }

    public Collection<Aluguel> obterLista(){
        return (Collection<Aluguel>) aluguelRepository.findAll();
    }

    public Collection<Aluguel> obterLista(Usuario usuario){
        return (Collection<Aluguel>) aluguelRepository.obterLista(usuario.getId());
    }

    public void excluir(Integer id) {
        aluguelRepository.deleteById(id);
    }
}
