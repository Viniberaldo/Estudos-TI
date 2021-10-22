/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula06;

/**
 *
 * @author viniberaldo
 */
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControleRemoto c = new ControleRemoto(50,false,false);
        c.ligar();
        c.maisVolume();
        c.maisVolume();
        c.desligarMudo();
        c.abrirMenu();
        c.fecharMenu();
        
    }
    
}
