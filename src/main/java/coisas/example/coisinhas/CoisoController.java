package coisas.example.coisinhas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/coisas")
public class CoisoController {

    @Autowired
    private CoisasRepository coisasRepository;

    @GetMapping("/teste")
    public String teste(Model model) {
        model.addAttribute("mensagemcontroler",
                "Mensagem motivacional=D");
        return "Tela";
    }

    @GetMapping("criar")
    public ModelAndView tela() {
        ModelAndView mv = new ModelAndView("Teste");
        mv.addObject("coisasModel", new CoisasModel());
        return mv;
    }
//    @PostMapping("/create")
//    public String create(Coisa coisa, Model model) {
//        System.out.println("Pessoa nome" +coisa.nome);
//        System.out.println("Email" + coisa.email);
//        System.out.println("Usuario" + coisa.usuario);
//        model.addAttribute("coisa", coisa);
//        return "Tela";
//    }
    @PostMapping("/criar")
    public void criar(CoisasModel coisasModel ) {
        System.out.println("Ta aqui");
        var save=this.coisasRepository.save(coisasModel);
        System.out.println(save);

    }


}

