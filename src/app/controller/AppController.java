package app.controller;

import app.model.Figure;
import app.view.AppView;

public class AppController {
    private final Figure[] figures;
    private final AppView view;

    public AppController (Figure[] figures, AppView view) {
        this.figures = figures;
        this.view = view;
    }

    public void calcAndDisplayTotalArea () {
        double totalArea = 0;

        for (Figure figure: figures) {
            totalArea += figure.getArea();
        }

        view.printTotalArea(totalArea);
    }
}
