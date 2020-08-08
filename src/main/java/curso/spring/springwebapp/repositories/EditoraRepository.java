package curso.spring.springwebapp.repositories;

import curso.spring.springwebapp.domain.Editora;
import org.springframework.data.repository.CrudRepository;

public interface EditoraRepository extends CrudRepository<Editora, Long> {
}
