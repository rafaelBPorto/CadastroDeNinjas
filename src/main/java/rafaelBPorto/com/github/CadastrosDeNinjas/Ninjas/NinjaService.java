package rafaelBPorto.com.github.CadastrosDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    /* Pode-se iniciar o construtor para fazer injeção de dependência com @Autowired, mas por convenção não é utilizado */
    final private NinjaRepository ninjaRepository;
    final private NinjaMapper ninjaMapper;


    /* Ao invés do @Autowired é utilizado o construtor abaixo*/
    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    // Listar todos os ninjas
    public List<NinjaDTO> listarNinjas(){
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas.stream().map(ninjaMapper::map).collect(Collectors.toList());
    }

    // Buscar Ninja por id
    public NinjaDTO listarNinjaPorId(Long id){
//        return ninjaRepository.findById(id).orElse(null);
          Optional<NinjaModel> ninja = ninjaRepository.findById(id);
          return ninja.map(ninjaMapper::map).orElse(null);
    }

    // Criar ninja
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);

        return ninjaMapper.map(ninja);
    }

    //Deleter ninja por id
    public void deletarNinjaPorId(Long id){
        ninjaRepository.deleteById(id);
    }

    // Atualizar ninja por id
    public NinjaDTO atualizarNinja(Long id, NinjaDTO ninjaAtualizado){
        Optional<NinjaModel> ninjaExistente = ninjaRepository.findById(id);
        if(ninjaExistente.isEmpty()){
            NinjaModel ninjaModel = ninjaMapper.map(ninjaAtualizado);
            ninjaAtualizado.setId(id);
            NinjaModel ninjaSalvo = ninjaRepository.save(ninjaModel);
            return ninjaMapper.map(ninjaSalvo);
        }
        return null;
    }
}