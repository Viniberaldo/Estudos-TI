/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica09;

/**
 *
 * @author viniberaldo
 */
public class Funcionario extends Pessoa {
    //atributos
    private String setor;
    private boolean trabalhando;
    
    //metodo
    public void mudarTrabalho(){
        this.setTrabalhando(!isTrabalhando());
    }
    
    //setters e getters

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
