package app.model.impl;

import app.model.Figure;

public class Triangle implements Figure {
    private final double base;
    private final double height;

    public Triangle (double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea () {
        return 0.5 * base * height;
    }
}
