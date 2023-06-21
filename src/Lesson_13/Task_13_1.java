package Lesson_13;

// Інтерфейс
interface Drawable {
    void draw();
}

// Клас, що реалізує інтерфейс
class Circle implements Drawable {
    public void draw() {
        System.out.println("Малюю коло");
    }
}

// Клас, що реалізує інтерфейс
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Малюю прямокутник");
    }
}

// Головний клас
public class Task_13_1 {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();

        circle.draw();      // Виклик методу draw() для кола
        rectangle.draw();   // Виклик методу draw() для прямокутника
    }
}