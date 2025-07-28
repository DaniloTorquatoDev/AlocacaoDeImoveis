package dev.DanilloTorquato.AlocacaoDeImoveis.Pessoas;


import dev.DanilloTorquato.AlocacaoDeImoveis.Imoveis.ImoveisModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_pessoas")


public class PessoasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nome;

    private int numeroTelefone;

    private int cpf;

    private String email;

    @OneToOne(mappedBy = "pessoas")
    private ImoveisModel imoveis;



}
