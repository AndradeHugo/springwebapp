package curso.spring.springwebapp.bootstrap;

import curso.spring.springwebapp.domain.Autor;
import curso.spring.springwebapp.domain.Editora;
import curso.spring.springwebapp.domain.Livro;
import curso.spring.springwebapp.repositories.AutorRepository;
import curso.spring.springwebapp.repositories.EditoraRepository;
import curso.spring.springwebapp.repositories.LivroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AutorRepository autorRepository;
    private final LivroRepository livroRepository;
    private final EditoraRepository editoraRepository;

    public BootStrapData(AutorRepository autorRepository, LivroRepository livroRepository, EditoraRepository editoraRepository) {
        this.autorRepository = autorRepository;
        this.livroRepository = livroRepository;
        this.editoraRepository = editoraRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Começando em Bootstrap");

        Editora paulinas = new Editora("Paulinas", "Nao sei", "Rio de Janeiro", "RJ", "21380130");
        editoraRepository.save(paulinas);
        System.out.println("Editora: " + paulinas.toString());

        Autor hugo = new Autor("Hugo", "Silva");
        Livro livro1 = new Livro("Oto Livro", "123456");
        hugo.getLivros().add(livro1);
        livro1.getAutores().add(hugo);

        livro1.setEditora(paulinas);
        paulinas.getLivros().add(livro1);

        autorRepository.save(hugo);
        livroRepository.save(livro1);
        editoraRepository.save(paulinas);

        Autor vanessa = new Autor("Vanessa", "Sena");
        Livro livro2 = new Livro("Livro dela", "456");
        hugo.getLivros().add(livro2);
        livro2.getAutores().add(vanessa);

        livro2.setEditora(paulinas);
        paulinas.getLivros().add(livro2);

        autorRepository.save(vanessa);
        livroRepository.save(livro2);
        editoraRepository.save(paulinas);

        System.out.println("Número total de livros: " + livroRepository.count());
        System.out.println("Número de livros da editora: " + paulinas.getLivros().size());

    }

}
