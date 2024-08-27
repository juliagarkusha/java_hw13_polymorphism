package app;

import app.controller.AppController;
import app.model.Figure;
import app.model.impl.Circle;
import app.model.impl.Square;
import app.model.impl.Triangle;
import app.view.AppView;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = new Figure[] {
           new Circle(5),
           new Triangle(3, 4),
           new Square(7),
        };

        AppView appView = new AppView();
        AppController appController = new AppController(figure, appView);

        appController.calcAndDisplayTotalArea();
    }
}
