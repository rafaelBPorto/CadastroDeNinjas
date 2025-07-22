package rafaelBPorto.com.github.CadastrosDeNinjas.Ninjas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rafaelBPorto.com.github.CadastrosDeNinjas.Missoes.MissaoModel;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {
    private Long id;
    private String nome;
    private String email;
    private String imgUrl;
    private int idade;
    private String rank;
    private MissaoModel missao;
}
