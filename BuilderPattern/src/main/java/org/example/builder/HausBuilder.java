package org.example.builder;

import org.example.Haus;

public interface HausBuilder {

    public void bauFundament();

    public void bauWaende();

    public void bauDach();

    public void bauEinrichtung();

    public Haus getHouse();
}
