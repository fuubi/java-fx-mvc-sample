package sample.mvc.controller;

import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import sample.mvc.model.CircleModel;

/**
 * Created by fp on 26.02.17.
 */
public class CircleController {
    private CircleModel circleModel;


    public CircleController(CircleModel circleModel) {
        this.circleModel = circleModel;
    }


    public CircleModel getCircleModel() {
        return circleModel;
    }

    public void mousePosChanged(MouseEvent e) {
        circleModel.setRadius(e.getX());
    }

    public void mouseClicked(MouseEvent e) {
        circleModel.setColor(Color.color(Math.random(), Math.random(), Math.random()));
    }
}
