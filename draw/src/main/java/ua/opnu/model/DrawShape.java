package ua.opnu.model;

import java.awt.Point;
import java.awt.Shape;

public abstract class DrawShape { // Зробили клас абстрактним

    // Константи та фабричний метод newInstance() ВИДАЛЕНО

    private Point startPoint;
    private Point endPoint;

    // Конструктор без параметрів
    public DrawShape() {
        this(new Point(0, 0), new Point(0, 0));
    }

    public DrawShape(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Shape getShape() {
        return this.getShape(startPoint, endPoint);
    }

    // Метод тепер АБСТРАКТНИЙ, тому тіло відсутнє
    public abstract Shape getShape(Point startPoint, Point endPoint);

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
}