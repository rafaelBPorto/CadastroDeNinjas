package rafaelBPorto.com.github.CadastrosDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/")
    public String boasVindas(){
        return "API para Cadastro de Ninjas";
    }


    /* CRUD */

    // TODO Adicionar ninja (CREATE)
    @PostMapping("/ninja")
    public String criarNinja(){
        return "Ninja Criado com Sucesso";
    }

    // TODO Procurar Ninja por ID (READ)
    @GetMapping("/ninja/{id}")
    public String encontrarNinja(@PathVariable int id){
        return "Ninja " + id + " encontrado";
    }

    // TODO Mostrar todos os ninjas (READ)
    @GetMapping("/ninja")
    public String mostarNinjas(){
        return "Ninjas existentes";
    }

    // TODO Alterar dados dos ninjas (UPDATE)
    @PutMapping("/ninja/{id}")
    public String alterarNinja(@PathVariable int id){
        return "Ninja alterado com Sucesso";
    }

    // TODO Deletar Ninja (DELETE)
    @DeleteMapping("ninja/{id}")
    public String deletarNinja(@PathVariable int id){
        return "Ninja " + id + " apagado com Sucesso";
    }
}
