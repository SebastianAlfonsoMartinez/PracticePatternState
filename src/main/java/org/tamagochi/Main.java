package org.tamagochi;

public class Main {
    public static void main(String[] args) {

        Tamagochi pepillo = new Tamagochi();

        pepillo.imprimirEstado();
        pepillo.darDeComer();

        pepillo.imprimirEstado();
        pepillo.darDeBeber();

        pepillo.imprimirEstado();
        pepillo.darDeComer();

        pepillo.imprimirEstado();
        pepillo.darDeBeber();

        pepillo.darDeBeber();
        pepillo.imprimirEstado();

        pepillo.darDeBeber();
        pepillo.imprimirEstado();

        pepillo.darDeBeber();
        pepillo.imprimirEstado();


    }
}