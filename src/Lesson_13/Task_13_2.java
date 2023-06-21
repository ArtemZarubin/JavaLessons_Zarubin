package Lesson_13;

// Визначення інтерфейсу
interface Shape {
    double calculateArea();
}

// Реалізація інтерфейсу для кола
class Circle1 implements Shape {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Реалізація інтерфейсу для прямокутника
class Rectangle1 implements Shape {
    private double width;
    private double height;

    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Головний клас для демонстрації роботи з різними фігурами
public class Task_13_2 {
    public static void main(String[] args) {
        Shape circle = new Circle1(5);
        System.out.println("Площа кола: " + circle.calculateArea());

        Shape rectangle = new Rectangle1(4, 6);
        System.out.println("Площа прямокутника: " + rectangle.calculateArea());
    }
}