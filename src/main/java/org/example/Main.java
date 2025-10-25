package org.example;

public class Main {
    public static void main(String[] args) {
        // Абстрактный класс нельзя создать напрямую:
        // Animal animal = new Animal("Зверь"); // Ошибка компиляции

        // Создаем объекты подклассов
        Animal myDog = new Dog("Рекс");
        Animal myCat = new Cat("Мурзик");

        System.out.println("Собака по имени " + myDog.getName() + " говорит: " + myDog.makeSound());
        System.out.println("Кошка по имени " + myCat.getName() + " говорит: " + myCat.makeSound());
    }
}