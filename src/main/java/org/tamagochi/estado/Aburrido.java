package org.tamagochi.estado;

public class Aburrido implements Estado {


    @Override
    public Estado comer() {
        return new Sediento();
    }

    @Override
    public Estado beber() {
        return this;
    }

    @Override
    public Estado mimar() {
        return new Feliz();
    }
}
