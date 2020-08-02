package curso.spring.springwebapp.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titulo;
    private String isbn;

    @ManyToMany
    @JoinTable(name = "autor_livro", @JoinColumns(name = "livro_id"),
                inverseJoinColumns = @JoinColumns(name = "autor_id"))
    private Set<Autor> autores;

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autores=" + autores +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(id, livro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
