/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.pessoas;

/**
 *
 * @author viniberaldo
 */
public class Professor extends Pessoa {
    //atributos
    private String especialidade;
    private float salario;

    public Professor(String nome, int idade, char sexo) {
        super(nome, idade, sexo);
    }

    Professor() {
    }
    
    //método
    public void receberAum(float a) {
        this.setSalario(getSalario() + a);
    }
    //acessorios

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
