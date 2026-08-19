package dev.brunoevoluindo.CadastroDeNinja.Missoes.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.brunoevoluindo.CadastroDeNinja.Ninjas.Model.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome_m;

    private String dificuldade_m;

    //@OneToMany - Vários ninjas para uma missão
    @OneToMany(mappedBy = "missoes")
    @JsonIgnore
    private List<NinjaModel> ninjas;

}
