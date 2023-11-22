package org.tamagochi.estado;

public class Sediento implements Estado{
    @Override
    public Estado comer() {
        return this;
    }

    @Override
    public Estado beber() {
        return new Feliz();
    }

    @Override
    public Estado mimar() {
        return this;
    }
}
