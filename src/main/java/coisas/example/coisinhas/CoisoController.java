package coisas.example.coisinhas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
