/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

/**
 *
 * @author Admin
 */
// Main.java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Aluno("Maria", 20, "A001"));
        pessoas.add(new Professor("João", 35, "P1234"));
        pessoas.add(new Funcionario("Carlos", 30, "F5678"));

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Identificador: " + ((Identificavel) pessoa).getId());
            System.out.println("Atividade: " + pessoa.atividade());
            System.out.println("--------------------------");
        }
    }
}
