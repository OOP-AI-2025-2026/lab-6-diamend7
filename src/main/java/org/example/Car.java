// Используем нетипизированный интерфейс, как требуется в задании
public class Car implements Comparable {

    private int price;
    private int year; // рік виготовлення
    private int horsePower;

    // Конструктор с тремя аргументами
    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    // --- Гетери та сетери ---
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    
    @Override
    public String toString() {
        // Удобно для проверки сортировки
        return "Car{" + "price=" + price + ", year=" + year + ", hp=" + horsePower + '}';
    }

    /**
     * Реализация метода compareTo.
     * @param o Объект для сравнения.
     * @return 1 (больше), -1 (меньше), 0 (равны)
     */
    @Override
    public int compareTo(Object o) {
        // 1. Проверяем тип и приводим (кастуем) объект
        if (!(o instanceof Car)) {
            // Не можем сравнить Car с чем-то другим
            return 0; // или можно бросить исключение ClassCastException
        }
        
        Car otherCar = (Car) o;

        // 2. Логика сравнения
        
        // "спочатку порівнюється ціна... 'більше' той... у кого менша ціна"
        // Это ОБРАТНОЕ сравнение по цене
        if (this.price < otherCar.price) {
            return 1; // "this" "больше", т.к. его цена МЕНЬШЕ
        }
        if (this.price > otherCar.price) {
            return -1; // "this" "меньше", т.к. его цена БОЛЬШЕ
        }

        // Если мы дошли сюда, значит цены равны (this.price == otherCar.price)
        // "порівнюється рік випуску... 'більше' той... який менший за віком"
        // "Меньший за віком" = "моложе" = год выпуска БОЛЬШЕ
        // Это ПРЯМОЕ сравнение по году
        if (this.year > otherCar.year) {
            return 1; // "this" "больше", т.к. его год БОЛЬШЕ (он новее)
        }
        if (this.year < otherCar.year) {
            return -1; // "this" "меньше", т.к. его год МЕНЬШЕ (он старше)
        }

        // Если мы дошли сюда, значит и цены, и годы равны
        // "порівнюються за кількістю кінських сил. 'Більше' той... у якого... більше"
        // Это ПРЯМОЕ сравнение по мощности
        if (this.horsePower > otherCar.horsePower) {
            return 1; // "this" "больше", т.к. мощность БОЛЬШЕ
        }
        if (this.horsePower < otherCar.horsePower) {
            return -1; // "this" "меньше", т.к. мощность МЕНЬШЕ
        }

        // Если мы дошли сюда, все поля равны
        return 0;
    }
}