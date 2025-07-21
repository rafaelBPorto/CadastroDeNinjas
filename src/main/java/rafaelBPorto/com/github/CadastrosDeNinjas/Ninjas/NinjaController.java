package rafaelBPorto.com.github.CadastrosDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

//    @Autowired
    private final NinjaService ninjaService;
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping()
    public String boasVindas(){
        return "API para Cadastro de Ninjas";
    }

    /* CRUD */

    // Adicionar ninja (CREATE)
    @PostMapping("/")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Procurar Ninja por ID (READ)
    @GetMapping("/{id}")
    public NinjaModel listarNinjaPorId(@PathVariable Long id){
        return ninjaService.listarNinjaPorId(id);
    }

    // TODO Alterar dados dos ninjas (UPDATE)
    @PutMapping("/{id}")
    public String alterarNinja(@PathVariable int id){
        return "Ninja alterado com Sucesso";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/{id}")
    public String deletarNinja(@PathVariable Long id){
        ninjaService.deletarNinjaPorId(id);
        return "Ninja " + id + " apagado com Sucesso";
    }
}
