package rafaelBPorto.com.github.CadastrosDeNinjas.Ninjas;

import jakarta.persistence.*;
import rafaelBPorto.com.github.CadastrosDeNinjas.Missoes.MissaoModel;

import java.util.List;

@Entity // Transforma a class em uma entidade do banco de dados
@Table(name = "tb_cadastro")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // Vários ninjas irão para uma única missão
    @ManyToOne
    @JoinColumn(name = "missao_id") //FK
    private MissaoModel missao;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
