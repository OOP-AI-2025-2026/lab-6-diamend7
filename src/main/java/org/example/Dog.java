public class Dog extends Animal {

    public Dog(String name) {
        super(name); // Вызываем конструктор родительского класса
    }

    @Override
    String makeSound() {
        return "Гав!";
    }
}