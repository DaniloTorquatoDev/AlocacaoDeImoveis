package dev.DanilloTorquato.AlocacaoDeImoveis.Imoveis;

import dev.DanilloTorquato.AlocacaoDeImoveis.Pessoas.PessoasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "tb_cadastro_de_imoveis")
public class ImoveisModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String endereco;

    private String numeroImovel;

    private int quantidadeDeQuartos;

    private int qauntidadeDeBanheiros;

    private boolean garagem;

    private Double valorAluguelImovel;

    @OneToOne
    @JoinColumn(name = "pessoas_id", unique = true)
    private PessoasModel pessoas;

}
