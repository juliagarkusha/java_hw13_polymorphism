package app.model.impl;

import app.model.Figure;

public class Circle implements Figure {
    private final double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea () {
        return Math.PI * radius * radius;
    }
}
