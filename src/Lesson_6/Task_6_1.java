package Lesson_6;

public class Task_6_1 {
    public static void main(String[] args) {
        // Создание объекта Point
        Point point = new Point(23, 94);

        // Работа с объектом Point
        int x = point.getX();
        int y = point.getY();
        System.out.println("Координаты точки: (" + x + ", " + y + ")");

        // Создание объекта Rectangle
        Rectangle rectangle = new Rectangle(point, 100, 200);

        // Работа с объектом Rectangle
        int width = rectangle.getWidth();
        int height = rectangle.getHeight();
        System.out.println("Размеры прямоугольника: " + width + " x " + height);

        // Изменение размеров прямоугольника
        rectangle.setWidth(150);
        rectangle.setHeight(250);
        System.out.println("Новые размеры прямоугольника: " + rectangle.getWidth() + " x " + rectangle.getHeight());

        // Создание ещё одного объекта Rectangle
        Rectangle anotherRectangle = new Rectangle(50, 100);
        System.out.println("Размеры второго прямоугольника: " + anotherRectangle.getWidth() + " x " + anotherRectangle.getHeight());
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Rectangle {
    private Point origin;
    private int width;
    private int height;

    public Rectangle(Point origin, int width, int height) {
        this.origin = origin;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this(new Point(0, 0), width, height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}