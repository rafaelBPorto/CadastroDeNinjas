package rafaelBPorto.com.github.CadastrosDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/")
    public String boasVindas(){
        return "API para Cadastro de Ninjas";
    }
}
