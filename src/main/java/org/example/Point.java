// Интерфейс, который был дан
interface Movable {
    void setX(double x);
    void setY(double y);
    double getX();
    double getY();
    void moveTo(double x, double y);
}

// Класс, реализующий интерфейс
public class Point implements Movable {

    private double x;
    private double y;

    // Конструктор для удобства (не обязателен по заданию, но полезен)
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Можем добавить метод toString() для удобного вывода
    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}