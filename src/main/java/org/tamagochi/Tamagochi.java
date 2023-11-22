package org.tamagochi;

import org.tamagochi.estado.Estado;
import org.tamagochi.estado.Feliz;

public class Tamagochi {

    private Estado estadoActual;


    public Tamagochi() {
        estadoActual = new Feliz();
    }

    public Tamagochi(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }

    public void darDeComer(){
        estadoActual = estadoActual.comer();
    }

    public void darDeBeber(){
        estadoActual = estadoActual.beber();
    }

    public void darMimos(){
        estadoActual = estadoActual.mimar();
    }

    public String imprimirEstado(){
        System.out.println(estadoActual);
        return estadoActual.toString();
    }
}
