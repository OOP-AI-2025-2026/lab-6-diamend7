public class Cat extends Animal {

    public Cat(String name) {
        super(name); // Вызываем конструктор родительского класса
    }

    @Override
    String makeSound() {
        return "Мяу!";
    }
}