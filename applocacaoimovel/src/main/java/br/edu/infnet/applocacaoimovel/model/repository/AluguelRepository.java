package br.edu.infnet.applocacaoimovel.model.repository;

import br.edu.infnet.applocacaoimovel.model.domain.Aluguel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AluguelRepository extends CrudRepository<Aluguel, Integer> {

}
