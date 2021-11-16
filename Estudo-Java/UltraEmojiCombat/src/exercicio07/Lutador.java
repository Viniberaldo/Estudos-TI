/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio07;

/**
 *
 * @author viniberaldo
 */
public class Lutador {
    //atributos
    private String nome;
    private String pais;
    private int idade;
    private float altura;
    private float peso;
    private String cat;
    private int win;
    private int loss;
    private int draw;
    
    //construtor

    public Lutador(String no, String pa, int id, float al, float pe, int wi, int lo, int dr) {
        this.nome = no;
        this.pais = pa;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.win = wi;
        this.loss = lo;
        this.draw = dr;
    }
    
    //métodos publicos
    
    public void apresentar() {
        System.out.println("---------------------------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("País: " + this.getPais());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + " m de altura");
        System.out.println("Pesando " + this.getPeso() + " Kg");
        System.out.println("Ganhou: "+ this.getWin());
        System.out.println("Perdeu: "+ this.getLoss());
        System.out.println("Empatou: "+ this.getDraw());
    }
    
    public void status() {
        System.out.println(this.getNome());
        System.out.println("é um peso "+this.getCat());
        System.out.println(this.getWin() + " vitórias");
        System.out.println(this.getLoss() + " derrotas");
        System.out.println(this.getDraw() + " empates");
        
    }
    
    public void ganharLuta() {
        this.setWin(getWin()+1);
    }
    
    public void perderLuta() {
        this.setLoss(getLoss()+1);    
    }
    
    public void empatarLuta() {
        this.setDraw(getDraw()+1);
    }
    
    //setters e getters

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float pe) {
        this.peso = pe;
        this.setCat();
    }

    public String getCat() {
        return cat;
    }

    public void setCat() {
        if (this.peso < 52.2) {
            this.cat = "invalido";
        } else if (this.peso <= 70.3) {
            this.cat="Leve";
        } else if (this.peso <= 83.9) {
            this.cat="Medio";
        } else if (this.peso <= 120.2) {
            this.cat="Pesado";
        } else {
            this.cat = "invalido";
        }
                
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }
    
    
    
    
}
