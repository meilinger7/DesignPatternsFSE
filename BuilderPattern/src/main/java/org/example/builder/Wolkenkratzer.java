package org.example.builder;

import org.example.Haus;

public class Wolkenkratzer implements HausBuilder{
    private Haus haus;

    public Wolkenkratzer()
    {
        this.haus = new Haus();
    }

    @Override
    public void bauFundament() {
        haus.setFundament("Beton-Fundament");
    }

    @Override
    public void bauWaende() {
        haus.setWaende("Betonwände");
    }

    @Override
    public void bauDach() {
        haus.setDach("Flachdach");
    }

    @Override
    public void bauEinrichtung() {
        haus.setEinrichtung("neumodische Einrichtung");
    }

    @Override
    public Haus getHouse() {
        return this.haus;
    }
}
