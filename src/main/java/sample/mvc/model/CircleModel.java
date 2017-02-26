package sample.mvc.model;

import javafx.scene.paint.Color;

import java.util.Observable;

/**
 * Created by fp on 26.02.17.
 */
public class CircleModel extends Observable{
    private double radius;
    private Color color;

    public CircleModel(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        setChanged();
        notifyObservers();
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setChanged();
        notifyObservers();
    }
}
