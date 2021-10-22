/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pratica09;

/**
 *
 * @author viniberaldo
 */
public interface Publicacao {
    //metodos publicos, validos para livros, revistas, jornais e publicacoes em geral
    public void abrir();
    public void fechar();
    public void folhear(int p);
    public void avancarPag();
    public void voltarPag();

}  
