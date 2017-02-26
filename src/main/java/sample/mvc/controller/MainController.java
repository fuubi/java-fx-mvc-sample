package sample.mvc.controller;

import javafx.stage.Stage;
import sample.mvc.model.MainModel;

/**
 * Created by fp on 26.02.17.
 */
public class MainController {
    private final MainModel model;
    private final CircleController circleController;

    public MainController(Stage stage, MainModel model) {
        this.model = model;
        this.circleController = new CircleController(model.getCircleModel());
    }

    public CircleController getCircleController() {
        return circleController;
    }
}
