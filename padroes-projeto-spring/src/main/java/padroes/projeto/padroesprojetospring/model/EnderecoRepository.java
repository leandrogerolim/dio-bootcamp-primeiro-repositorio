package padroes.projeto.padroesprojetospring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface EnderecoRepository extends CrudRepository <Endereco, String> {
}
