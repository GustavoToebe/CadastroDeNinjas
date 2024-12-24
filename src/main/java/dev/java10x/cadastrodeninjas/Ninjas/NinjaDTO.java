package dev.java10x.cadastrodeninjas.Ninjas;

import dev.java10x.cadastrodeninjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {

    private Integer id;
    private String nome;
    private Integer idade;
    private String email;
    private Integer rank;

    private MissoesModel missoes;
}
