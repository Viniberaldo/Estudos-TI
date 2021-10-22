/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06;

/**
 *
 * @author viniberaldo
 */
public class ControleRemoto implements Controlador {
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Métodos Especiais
    //construtor
    // metodos setters e getters

    ControleRemoto(int volume, boolean ligado, boolean tocando) {
        this.volume = volume;
        this.ligado = ligado;
        this.tocando = tocando;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //após implementar com interface
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("---MENU---");
        System.out.println("Sistema está ligado ? "+ this.isLigado());
        System.out.println("Está tocando ? " + this.isTocando());
        System.out.println("Volume " + this.getVolume());
        for (int i = 0; i<= (this.getVolume()-1); i+=10){
        System.out.print("[] ");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }
    

    @Override
    public void maisVolume() {
        if (this.isLigado() == true) {
            this.setVolume( getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado() == true) {
            this.setVolume( getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() == true && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }
    

    @Override
    public void desligarMudo() {
        if (this.isLigado() == true && getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() == true && this.isTocando() == false) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() == true && this.isTocando() == true) {
            this.setTocando(false);
        }
    }
    
    
    
}
