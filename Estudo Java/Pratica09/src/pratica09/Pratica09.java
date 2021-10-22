/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica09;

/**
 *
 * @author viniberaldo
 */
public class Pratica09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pessoa[] pessoal = new Pessoa[2];
        //var estante = new Livro[3];
        
        /*inicializando os objetos
        pessoal[0] = new Pessoa("Pedro", 22, 'M');
        pessoal[1] = new Pessoa("Maria",25,'F');
        
        estante[0] = new Livro("aprendendo Java", "jose da Silva", 300, pessoal[0]);
        estante[1] = new Livro("POO iniciante", "Pedro Paulo", 500, pessoal[1]);
        estante[2] = new Livro("java advance", "Fulano de tal", 800, pessoal[0]);
        
       estante[1].abrir();
       estante[1].folhear(350);
       estante[1].avancarPag();
        System.out.println(estante[1].detalhes());
       */ 
        
        var p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        
        System.out.println(p1.ToString());
        
        
        p2.setCurso("informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Almoxarifado");
        
        p1.receberAum(550.20);
        
        
        
    }
    
}
