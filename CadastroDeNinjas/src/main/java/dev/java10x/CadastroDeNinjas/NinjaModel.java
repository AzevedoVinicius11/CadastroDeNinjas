package dev.java10x.CadastroDeNinjas;

import jakarta.persistence.*;

@Entity // Transforma uma classe em uma entidade de BD
@Table(name = "tb_cadastro")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, int iadade, String email) {
        this.nome = nome;
        this.idade = iadade;
        this.email = email;
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
