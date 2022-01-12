package org.example;

import org.example.builder.HausBuilder;
import org.example.builder.HolzHaus;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        HausBuilder holzHausBuilder = new HolzHaus();
        Architekt architekt = new Architekt(holzHausBuilder);

        architekt.constructHouse();

        Haus haus = architekt.getHouse();

        System.out.println("Das Haus besteht aus: " + haus);

    }
}
