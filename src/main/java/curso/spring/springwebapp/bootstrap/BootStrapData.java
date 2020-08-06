package curso.spring.springwebapp.bootstrap;

import curso.spring.springwebapp.domain.Autor;
import curso.spring.springwebapp.domain.Editora;
import curso.spring.springwebapp.domain.Livro;
import curso.spring.springwebapp.repositories.AutorRepository;
import curso.spring.springwebapp.repositories.EnderecoRepository;
import curso.spring.springwebapp.repositories.LivroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AutorRepository autorRepository;
    private final LivroRepository livroRepository;
    private final EnderecoRepository enderecoRepository;

    public BootStrapData(AutorRepository autorRepository, LivroRepository livroRepository, EnderecoRepository enderecoRepository) {
        this.autorRepository = autorRepository;
        this.livroRepository = livroRepository;
        this.enderecoRepository = enderecoRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Autor hugo = new Autor("Hugo", "Silva");
        Livro oto = new Livro("Oto Livro", "123456");
        hugo.getLivros().add(oto);
        oto.getAutores().add(hugo);

        autorRepository.save(hugo);
        livroRepository.save(oto);

        Autor vanessa = new Autor("Vanessa", "Sena");
        Livro livro = new Livro("Livro dela", "456");
        hugo.getLivros().add(livro);
        oto.getAutores().add(vanessa);

        autorRepository.save(vanessa);
        livroRepository.save(livro);

        System.out.println("Começando em Bootstrap");
        System.out.println("Números de livros: " + livroRepository.count());

        Editora paulinas = new Editora("Nao sei", "Rio de Janeiro", "RJ", "21380130");
        enderecoRepository.save(paulinas);

        System.out.println("Endereaço: " + paulinas.toString());

    }

}
