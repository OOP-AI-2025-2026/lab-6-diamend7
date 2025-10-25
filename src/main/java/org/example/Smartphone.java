// Данные интерфейсы
interface GPS {
    double[] getCoordinates();
}

interface Cellular {
    void makeCall();
    void receiveCall();
}

// Класс, реализующий оба интерфейса
public class Smartphone implements GPS, Cellular {

    private String model;

    public Smartphone(String model) {
        this.model = model;
    }

    // --- Реализация методов интерфейса GPS ---
    @Override
    public double[] getCoordinates() {
        // Заглушка: возвращаем какие-то тестовые координаты
        // (Например, широта и долгота)
        return new double[]{46.4825, 30.7233}; // Координаты Одессы :)
    }

    // --- Реализация методов интерфейса Cellular ---
    @Override
    public void makeCall() {
        System.out.println(model + " совершает звонок...");
    }

    @Override
    public void receiveCall() {
        System.out.println(model + " принимает входящий звонок.");
    }

    // Собственные методы класса (не из интерфейсов)
    public String getModel() {
        return model;
    }
}