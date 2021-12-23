/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvorebinaria.model;

import java.util.Objects;

/**
 *
 * @author viniberaldo
 */
public class Obj extends ObjArvore<Obj>{
    
    Integer meuValor;
    
    public Obj(Integer meuValor){
        this.meuValor = meuValor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.meuValor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Obj other = (Obj) obj;
        return Objects.equals(this.meuValor, other.meuValor);
    }

    

    @Override
    public int compareTo(Obj outro) {
        int i = 0;
        if(this.meuValor > outro.meuValor){
            i = 1;
        }else if(this.meuValor < outro.meuValor){
            i=-1;
        }
        return i;
    }

    @Override
    public String toString() {
        return meuValor.toString();
    }
}
