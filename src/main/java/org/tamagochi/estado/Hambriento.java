package org.tamagochi.estado;

public class Hambriento implements Estado{
    @Override
    public Estado comer() {
        return new Sediento();
    }

    @Override
    public Estado beber() {
        return new Triste();
    }

    @Override
    public Estado mimar() {
        return this;
    }
}
