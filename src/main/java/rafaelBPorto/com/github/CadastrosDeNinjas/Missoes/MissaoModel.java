package rafaelBPorto.com.github.CadastrosDeNinjas.Missoes;

import jakarta.persistence.*;
import rafaelBPorto.com.github.CadastrosDeNinjas.Ninjas.NinjaModel;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    @OneToMany(mappedBy = "missao")  // Uma missão pode ter vários ninjas
    private List<NinjaModel> ninja;

    public MissaoModel() {
    }


}
