package Lesson_11;

// Батьківський клас
class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Підклас, що успадковує клас Shape
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

// Підклас, що успадковує клас Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length " + length + " and width " + width);
    }
}

// Приклад використання
public class Task_11_1 {
    public static void main(String[] args) {
        Shape shape1 = new Circle("Red", 3.5);
        shape1.draw();

        Shape shape2 = new Rectangle("Blue", 2.0, 4.0);
        shape2.draw();
    }
}