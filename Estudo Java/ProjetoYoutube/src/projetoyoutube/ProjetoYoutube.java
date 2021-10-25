/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author viniberaldo
 */
public class ProjetoYoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 12 de Java");
        v[2] = new Video("Aula mySQL");
        
        Aluno g[] = new Aluno[2];
        g[0] = new Aluno("Jubi", 22, "m", "JJ");
        g[1] = new Aluno("Creuza", 17, "f", "Creuzita");
        
        System.out.println(v[0].toString());
        System.out.println(g[1].toString());
        
        Visualizacao vis = new Visualizacao(g[0], v[2]);
        System.out.println(vis.toString());
        
    }
    
}
