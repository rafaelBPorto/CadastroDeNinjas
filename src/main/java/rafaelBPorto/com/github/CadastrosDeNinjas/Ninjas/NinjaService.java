package rafaelBPorto.com.github.CadastrosDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    /* Pode-se iniciar o construtor para fazer injeção de dependência com @Autowired mas por convenção não é utilizado */
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
        return ninjaRepository.findById(id).orElse(null);
    }

}
