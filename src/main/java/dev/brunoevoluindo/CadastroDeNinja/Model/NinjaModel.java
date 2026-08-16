package dev.brunoevoluindo.CadastroDeNinja.Model;

import jakarta.persistence.*;

//Entity transforma uma classe em uma entidade do BD.
//JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cla;
    private int idade;

    public NinjaModel() {
    }

    public NinjaModel(int idade, String cla, String nome) {
        this.idade = idade;
        this.cla = cla;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
