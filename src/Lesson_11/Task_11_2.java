package Lesson_11;

// Батьківський клас "Фрукт"
class Fruit {
    String color;

    void taste() {
        System.out.println("Цей фрукт має свіжий смак");
    }

    void origin() {
        System.out.println("Цей фрукт походить з різних країн");
    }
}

// Підклас "Яблуко", який успадковує клас "Фрукт"
class Apple extends Fruit {
    @Override
    void taste() {
        System.out.println("Це яблуко має солодкий смак");
    }

    void colorInfo() {
        System.out.println("Це яблуко має червоний колір");
    }
}

public class Task_11_2 {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.taste(); // Виводить: "Цей фрукт має свіжий смак"
        fruit.origin(); // Виводить: "Цей фрукт походить з різних країн"

        Apple apple = new Apple();
        apple.taste(); // Виводить: "Це яблуко має солодкий смак"
        apple.origin(); // Виводить: "Цей фрукт походить з різних країн"
        apple.colorInfo(); // Виводить: "Це яблуко має червоний колір"

        Fruit appleFruit = new Apple();
        appleFruit.taste(); // Виводить: "Це яблуко має солодкий смак"
        appleFruit.origin(); // Виводить: "Цей фрукт походить з різних країн"
        // appleFruit.colorInfo(); // Помилка компіляції - метод colorInfo() недоступний для типу Fruit
    }
}