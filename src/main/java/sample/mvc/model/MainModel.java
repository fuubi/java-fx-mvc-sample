package sample.mvc.model;

import javafx.scene.paint.Color;

/**
 * Created by fp on 26.02.17.
 */
public class MainModel {
    private final CircleModel circleModel;

    public MainModel() {
        this.circleModel = new CircleModel(100, Color.ALICEBLUE);
    }

    public CircleModel getCircleModel() {
        return circleModel;
    }
}
