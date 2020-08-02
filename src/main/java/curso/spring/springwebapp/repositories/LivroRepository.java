package curso.spring.springwebapp.repositories;

import curso.spring.springwebapp.domain.Livro;
import org.springframework.data.repository.CrudRepository;

public interface LivroRepository extends CrudRepository<Livro, Long> {
}
