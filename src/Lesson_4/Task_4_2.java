package Lesson_4;

public class Task_4_2 {
    public static void main(String[] args) {
        // Створення об'єкту класу Point
        Point point1 = new Point(2, 3);

        // Виклик методу для отримання значень координат
        int x = point1.getX();
        int y = point1.getY();

        // Виведення координат на консоль
        System.out.println("Координати точки: x = " + x + ", y = " + y);

        // Виклик методу для визначення відстані до іншої точки
        Point point2 = new Point(5, 7);
        double distance = point1.distanceTo(point2);

        // Виведення відстані на консоль
        System.out.println("Відстань між точками: " + distance);

        // Виклик методу для переміщення точки
        point1.move(1, -1);

        // Виведення нових координат після переміщення на консоль
        System.out.println("Нові координати точки: x = " + point1.getX() + ", y = " + point1.getY());
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

    public double distanceTo(Point otherPoint) {
        int deltaX = otherPoint.getX() - x;
        int deltaY = otherPoint.getY() - y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}