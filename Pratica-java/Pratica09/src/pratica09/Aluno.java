/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica09;

/**
 *
 * @author viniberaldo
 */
public class Aluno extends Pessoa {
    //atributos
    private int mat;
    private String curso;
    
    //métodos
    public void cancelarMatr() {
        this.setMat(0);
        this.setCurso(null);
        System.out.println("Matricula cancelada");
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
