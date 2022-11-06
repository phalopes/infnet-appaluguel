package br.edu.infnet.applocacaoimovel.model.repository;

import br.edu.infnet.applocacaoimovel.model.domain.SalaComercial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaComercialRepository extends CrudRepository<SalaComercial, Integer> {

}
