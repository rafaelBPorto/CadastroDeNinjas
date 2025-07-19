package rafaelBPorto.com.github.CadastrosDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missao")
public class MissaoController {
    @PostMapping()
    public String criarMissao(){
        return "Missao criada com sucesso";
    }

    @PutMapping("/{id}")
    public String atualizarMissao(@PathVariable("id") String id){
        return "Missao atualizada com sucesso";
    }

    @DeleteMapping("/{id}")
    public String deletarMissao(@PathVariable("id" ) String id) {
        return "Missao deletada com sucesso";
    }

    @GetMapping()
    public String listarMissao(){
        return "Missao listada com sucesso";
    }

    @GetMapping("/{id}")
    public String buscarMissao(@PathVariable("id" ) String id){
        return "Missao buscada com sucesso";
    }
}
