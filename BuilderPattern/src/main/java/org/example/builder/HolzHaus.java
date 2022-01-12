package org.example.builder;

import org.example.Haus;

public class HolzHaus implements HausBuilder{

    private Haus haus;

    public HolzHaus()
    {
        this.haus = new Haus();
    }

    @Override
    public void bauFundament() {
        haus.setFundament("Holz-Fundament");
    }

    @Override
    public void bauWaende() {
        haus.setWaende("Holzwände");
    }

    @Override
    public void bauDach() {
        haus.setDach("Holzdach");
    }

    @Override
    public void bauEinrichtung() {
        haus.setEinrichtung("altmodische Einrichtung");
    }

    @Override
    public Haus getHouse() {
        return this.haus;
    }
}
