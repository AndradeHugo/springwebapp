package curso.spring.springwebapp.controllers;

import curso.spring.springwebapp.repositories.AutorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class AutorController {

    private final AutorRepository autorRepository;

    @RequestMapping("/autores")
    public String getAutores(Model model) {
        model.addAttribute("autores", autorRepository.findAll());
        return "autores/lista";
    }

}
