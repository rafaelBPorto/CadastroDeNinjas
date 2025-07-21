package rafaelBPorto.com.github.CadastrosDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    /* Pode-se iniciar o construtor para fazer injeção de dependência com @Autowired, mas por convenção não é utilizado */
    private NinjaRepository ninjaRepository;
    /* Ao invés do @Autorided é utilizado o construtor abaixo*/
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos os ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    // Buscar Ninja por id
    public NinjaModel listarNinjaPorId(Long id){
//        return ninjaRepository.findById(id).orElse(null);
          Optional<NinjaModel> ninja = ninjaRepository.findById(id);
          return ninja.orElse(null);
    }

    // Criar ninja
    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    //Deleter ninja por id
    public void deletarNinjaPorId(Long id){
        ninjaRepository.deleteById(id);
    }
}
