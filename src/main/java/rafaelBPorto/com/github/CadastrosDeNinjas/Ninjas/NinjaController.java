package rafaelBPorto.com.github.CadastrosDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

//    @Autowired
    private final NinjaService ninjaService;
    private final NinjaRepository ninjaRepository;

    public NinjaController(NinjaService ninjaService, NinjaRepository ninjaRepository) {
        this.ninjaService = ninjaService;
        this.ninjaRepository = ninjaRepository;
    }

    @GetMapping()
    public String boasVindas(){
        return "API para Cadastro de Ninjas";
    }

    /* CRUD */

    // Adicionar ninja (CREATE)
    @PostMapping("/")
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja){
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/")
    public List<NinjaDTO> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Procurar Ninja por ID (READ)
    @GetMapping("/{id}")
    public NinjaDTO listarNinjaPorId(@PathVariable Long id){
        return ninjaService.listarNinjaPorId(id);
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/{id}")
    public NinjaDTO alterarNinja(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado){
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
}

    // Deletar Ninja (DELETE)
    @DeleteMapping("/{id}")
    public String deletarNinja(@PathVariable Long id){
        ninjaService.deletarNinjaPorId(id);
        return "Ninja " + id + " apagado com Sucesso";
    }
}
