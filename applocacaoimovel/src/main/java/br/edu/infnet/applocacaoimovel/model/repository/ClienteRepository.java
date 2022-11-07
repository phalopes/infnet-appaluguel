package br.edu.infnet.applocacaoimovel.model.repository;

import br.edu.infnet.applocacaoimovel.model.domain.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    @Query("from Cliente c where c.usuario.id =:userid")
    Iterable<Cliente> obterLista(Integer userid);
}
