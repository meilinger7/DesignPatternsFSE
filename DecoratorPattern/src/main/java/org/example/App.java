package org.example;

import org.example.decorator.RedShapeDecorator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Kreis ohne Umrandung:");
        Shape kreis = new Circle();
        kreis.draw();

        System.out.println("\nKreis mit roter Umrandung:");
        Shape roterKreis = new RedShapeDecorator(new Circle());
        roterKreis.draw();

        System.out.println("\nRechteck mit roter Umrandung:");
        Shape rotesRechteck = new RedShapeDecorator(new Rectangle());
        rotesRechteck.draw();

    }
}
