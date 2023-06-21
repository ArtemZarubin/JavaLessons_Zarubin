package Lesson_12;

// Абстрактний клас
abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // Абстрактний метод, який буде реалізований у дочірніх класах
    public abstract double getArea();

    public void display() {
        System.out.println("Це фігура з коліром: " + color);
    }
}

// Дочірній клас Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

// Дочірній клас Circle
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Головний клас
public class Task_12_1 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("червоний", 5, 3);
        Shape circle = new Circle("синій", 2.5);

        rectangle.display();
        System.out.println("Площа прямокутника: " + rectangle.getArea());

        circle.display();
        System.out.println("Площа кола: " + circle.getArea());
    }
}

