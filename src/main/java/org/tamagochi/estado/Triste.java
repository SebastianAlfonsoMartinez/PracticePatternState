package org.tamagochi.estado;

public class Triste implements Estado{
    @Override
    public Estado comer() {
        return new Feliz();
    }

    @Override
    public Estado beber() {
        return new Aburrido();
    }

    @Override
    public Estado mimar() {
        return new Feliz();
    }
}
