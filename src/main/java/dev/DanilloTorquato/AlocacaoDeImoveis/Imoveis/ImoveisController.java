package dev.DanilloTorquato.AlocacaoDeImoveis.Imoveis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ImoveisController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Boas Vindas ao Cadastro de imoveis";
    }

}
