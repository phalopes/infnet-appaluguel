package br.edu.infnet.applocacaoimovel.model.repository;

import br.edu.infnet.applocacaoimovel.model.domain.Aluguel;
import br.edu.infnet.applocacaoimovel.model.domain.Imovel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImovelRepository extends CrudRepository<Imovel, Integer> {
    @Query("from Imovel i where i.usuario.id =:userid")
    List<Imovel> obterLista(Integer userid);

}
