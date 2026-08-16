package dev.brunoevoluindo.CadastroDeNinja.Ninjas.Model;

import dev.brunoevoluindo.CadastroDeNinja.Missoes.Model.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity transforma uma classe em uma entidade do BD.
// JPA = Java Persistence API
// Table(name = "  ") - Dá um nome para a tabela
/* NoArgsConstructor - Adiciona um construtor vazio
que irá ser atualizado automaticamente pelo Lombok. */
/* AllArgsConstructor - Adiciona um construtor completo
que irá ser atualizado automaticamente pelo Lombok. */
/* Data - Adiciona todos os Getters e Setters de cada atributo
e será atualizado automaticamente pelo Lombok. */
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    /* Id + GeneratedValue(strategy = GenerationType.IDENTITY) _
    o atributo ID irá ser atribuído sequencialmente (1, 2, 3, ...) */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    /* Column(unique = true) - essa coluna não pode ter itens repetidos.
    Utilizado em cpf, rg, n_passaporte, ou seja, dados ÚNICOS de cada pessoa. */
    @Column(unique = true)
    private String email;

    private int idade;

    //@ManyToOne - um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreing Key ou Chave Estrangeira
    private MissoesModel missoes;

}