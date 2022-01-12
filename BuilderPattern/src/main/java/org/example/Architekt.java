package org.example;

import org.example.builder.HausBuilder;

public class Architekt {
    private HausBuilder hausBuilder;

    public Architekt(HausBuilder hausBuilder)
    {
        this.hausBuilder = hausBuilder;
    }

    public Haus getHouse()
    {
        return this.hausBuilder.getHouse();
    }

    public void constructHouse()
    {
        this.hausBuilder.bauFundament();
        this.hausBuilder.bauWaende();
        this.hausBuilder.bauDach();
        this.hausBuilder.bauEinrichtung();
    }
}
