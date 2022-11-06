package br.edu.infnet.applocacaoimovel.model.repository;

import br.edu.infnet.applocacaoimovel.model.domain.Studio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudioRepository extends CrudRepository<Studio, Integer> {

}
