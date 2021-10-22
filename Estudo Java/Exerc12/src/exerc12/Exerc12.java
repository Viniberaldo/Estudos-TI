/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerc12;

/**
 *
 * @author viniberaldo
 */
public class Exerc12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var m = new Mamifero();
        
        m.alimentar();
        
        var p = new Peixe();
        
        p.soltarBolha();
        p.alimentar();
    }
    
}
