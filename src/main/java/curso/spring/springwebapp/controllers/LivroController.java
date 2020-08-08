package curso.spring.springwebapp.controllers;

import curso.spring.springwebapp.repositories.LivroRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LivroController {

    private final LivroRepository livroRepository;

    public LivroController(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @RequestMapping("/livros")
    public String getLivros(Model model) {
        model.addAttribute("livros", livroRepository.findAll());
        return "livros/lista";
    }

}
