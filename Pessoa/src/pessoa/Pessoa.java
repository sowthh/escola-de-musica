/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoa;

/**
 *
 * @author Admin
 */
// Pessoa.java
public abstract class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract String atividade();

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
