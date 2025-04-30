package coisas.example.coisinhas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class CoisoController {
    @GetMapping("teste")
    public String teste(Model model) {
        model.addAttribute("mensagemcontroler",
                "Mensagem motivacional=D");
        return "Teste";
    }

    @PostMapping("/create")
    public String create(Coisa coisa, Model model) {
        System.out.println("Pessoa nome" +coisa.nome);
        System.out.println("Email" + coisa.email);
        System.out.println("Usuario" + coisa.usuario);
        model.addAttribute("coisa", coisa);
        return "Tela";
    }

    
    record Coisa(String nome, String email, String usuario) {}
}

