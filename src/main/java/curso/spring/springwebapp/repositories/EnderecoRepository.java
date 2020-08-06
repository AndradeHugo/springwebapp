package curso.spring.springwebapp.repositories;

import curso.spring.springwebapp.domain.Editora;
import org.springframework.data.repository.CrudRepository;

public interface EnderecoRepository extends CrudRepository<Editora, Long> {
}
