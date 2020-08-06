package curso.spring.springwebapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Editora {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String enderecoLinha1;
    private String cidade;
    private String estado;
    private String cep;

    public Editora(String enderecoLinha1, String cidade, String estado, String cep) {
        this.enderecoLinha1 = enderecoLinha1;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Editora{" +
                "id=" + id +
                ", enderecoLinha1='" + enderecoLinha1 + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Editora editora = (Editora) o;
        return Objects.equals(id, editora.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
