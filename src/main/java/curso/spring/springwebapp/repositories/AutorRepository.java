package curso.spring.springwebapp.repositories;

import curso.spring.springwebapp.domain.Autor;
import org.springframework.data.repository.CrudRepository;

public interface AutorRepository extends CrudRepository<Autor, Long> {
}
