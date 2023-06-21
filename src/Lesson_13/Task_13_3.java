package Lesson_13;

// Оголошення інтерфейсу
interface Shape2 {
    void draw();
}

// Клас, що реалізує інтерфейс Shape
class Circle2 implements Shape2 {
    @Override
    public void draw() {
        System.out.println("Малюю коло");
    }
}

// Клас, що реалізує інтерфейс Shape
class Rectangle2 implements Shape2 {
    @Override
    public void draw() {
        System.out.println("Малюю прямокутник");
    }
}

// Головний клас
public class Task_13_3 {
    public static void main(String[] args) {
        // Створення об'єктів за допомогою інтерфейсу як типу
        Shape2 circle = new Circle2();
        Shape2 rectangle = new Rectangle2();

        // Виклик методів відповідно до інтерфейсу
        circle.draw();
        rectangle.draw();
    }
}