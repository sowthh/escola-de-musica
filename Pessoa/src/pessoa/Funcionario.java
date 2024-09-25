/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

/**
 *
 * @author Admin
 */
// Funcionario.java
public class Funcionario extends Pessoa implements Identificavel {
    private String cracha;

    public Funcionario(String nome, int idade, String cracha) {
        super(nome, idade);
        this.cracha = cracha;
    }

    @Override
    public String atividade() {
        return "Realizar tarefas administrativas.";
    }

    @Override
    public String getId() {
        return cracha;
    }
}
