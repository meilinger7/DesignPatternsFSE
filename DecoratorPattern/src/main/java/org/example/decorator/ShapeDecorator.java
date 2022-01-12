package org.example.decorator;

import org.example.Shape;

public class ShapeDecorator implements Shape {
    public Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
