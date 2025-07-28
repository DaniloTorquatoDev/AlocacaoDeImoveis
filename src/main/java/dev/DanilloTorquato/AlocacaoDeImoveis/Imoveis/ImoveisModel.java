package dev.DanilloTorquato.AlocacaoDeImoveis.Imoveis;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ImoveisModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String endereco;

    private String numeroImovel;

    private int quantidadeDeQuartos;

    private int qauntidadeDeBanheiros;

    private boolean garagem;

}
