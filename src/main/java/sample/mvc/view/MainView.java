package sample.mvc.view;

import javafx.scene.layout.StackPane;
import sample.mvc.controller.MainController;
import sample.mvc.model.MainModel;

/**
 * Created by fp on 26.02.17.
 */
public class MainView extends StackPane {
    private final MainModel model;
    private final MainController controller;

    public MainView(MainModel model, MainController controller) {
        this.model = model;
        this.controller = controller;
        CirclePane circleView = new CirclePane(model.getCircleModel(), controller.getCircleController());
        this.getChildren().add(circleView);
        createListners();
    }

    private void createListners() {
        this.setOnMouseMoved(e -> controller.getCircleController().mousePosChanged(e));
    }
}
