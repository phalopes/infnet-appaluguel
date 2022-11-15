package br.edu.infnet.applocacaoimovel.model.repository;

import br.edu.infnet.applocacaoimovel.model.domain.Aluguel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AluguelRepository extends CrudRepository<Aluguel, Integer> {
    @Query("from Aluguel a where a.usuario.id =:userid")
    List<Aluguel> obterLista(Integer userid);
}
