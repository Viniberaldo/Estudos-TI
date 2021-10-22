/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.pessoas;

/**
 * A classe pessoa lê classe livros 
 * @author viniberaldo
 */
public class Pessoa {
    //atributos da classe
    protected String nome;
    protected int idade;
    protected char sexo; // sexo é masculino (M) ou feminino (F)

    Pessoa() {
    }

    
    //método da classe
    public void fazerAniver() {
       this.setIdade(getIdade()+1);
    }
    
    //método construtor

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    
    //métodos setters e getters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }

    void receberAum(double d) {
    }

    boolean ToString() {
    }

   
}
