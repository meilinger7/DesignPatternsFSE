package org.example;

public class Haus implements HausPlan{
    private String fundament;
    private String waende;
    private String dach;
    private String einrichting;

    @Override
    public void setFundament(String fundament) {
        this.fundament=fundament;
    }

    @Override
    public void setWaende(String waende) {
        this.waende=waende;
    }

    @Override
    public void setDach(String dach) {
        this.dach=dach;
    }

    @Override
    public void setEinrichtung(String einrichtung) {
        this.einrichting=einrichtung;
    }

    public String toString(){
        return this.fundament + ", " + this.waende + ", " + this.dach + ", "  + this.einrichting;
    }
}
