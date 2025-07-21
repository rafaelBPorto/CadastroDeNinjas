package rafaelBPorto.com.github.CadastrosDeNinjas.Ninjas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rafaelBPorto.com.github.CadastrosDeNinjas.Missoes.MissaoModel;

import java.util.List;

@Entity // Transforma a class em uma entidade do banco de dados
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    private String nome;

    @Column (unique = true)
    private String email;

    @Column (name = "img_url")
    private String imgUrl;

    @Column (name = "idade")
    private int idade;

    // Vários ninjas irão para uma única missão
    @ManyToOne
    @JoinColumn(name = "missao_id") //FK
    private MissaoModel missao;

}
