/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaduplamenteencadeada;

/**
 *
 * @author viniberaldo
 */
public class NoDuplo<T> {
    
    private T conteudo;
    private NoDuplo<T> noSeguinte;
    private NoDuplo<T> noPrevio;
    
    public NoDuplo(T conteudo){
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoSeguinte() {
        return noSeguinte;
    }

    public void setNoSeguinte(NoDuplo<T> noSeguinte) {
        this.noSeguinte = noSeguinte;
    }

    public NoDuplo<T> getNoPrevio() {
        return noPrevio;
    }

    public void setNoPrevio(NoDuplo<T> noPrevio) {
        this.noPrevio = noPrevio;
    }

    @Override
    public String toString() {
        return "NoDuplo{" + "conteudo=" + conteudo + '}';
    }
    
    
}
