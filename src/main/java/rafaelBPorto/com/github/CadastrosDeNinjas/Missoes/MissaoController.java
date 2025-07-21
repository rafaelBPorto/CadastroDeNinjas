package rafaelBPorto.com.github.CadastrosDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missao")
public class MissaoController {

    public MissaoService missaoService;
    public MissaoController(MissaoService missaoService) {
        this.missaoService = missaoService;
    }

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
    public List<MissaoModel> listarMissao(){
        return missaoService.listarMissoes();
    }

    @GetMapping("/{id}")
    public String buscarMissao(@PathVariable("id" ) String id){
        return "Missao buscada com sucesso";
    }
}
