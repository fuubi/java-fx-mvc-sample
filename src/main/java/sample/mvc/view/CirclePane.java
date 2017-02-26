package sample.mvc.view;

import javafx.scene.shape.Circle;
import sample.mvc.controller.CircleController;
import sample.mvc.model.CircleModel;

/**
 * Created by fp on 26.02.17.
 */
public class CirclePane extends Circle {

    public CirclePane(CircleModel circleModel, CircleController circleController) {
        this.setRadius(circleModel.getRadius());
        circleModel.addObserver((o, arg) -> {
            this.setRadius(circleModel.getRadius());
            this.setFill(circleModel.getColor());
        });
        this.setOnMouseClicked(circleController::mouseClicked);


    }
}
