package Lesson_6;

public class Task_6_2 {
    public static void main(String[] args) {
        // Создание объекта и присваивание ссылки
        Box box1 = new Box(10, 20, 30);
        Box box2 = box1;

        // Изменение значений через ссылку box1
        box1.setWidth(15);
        box1.setHeight(25);
        box1.setDepth(35);

        // Вывод значений через ссылку box2
        System.out.println("Размеры box2: " + box2.getWidth() + " x " + box2.getHeight() + " x " + box2.getDepth());

        // Присваивание null ссылке
        box1 = null;

        // Попытка доступа к объекту через null ссылку (вызовет NullPointerException)
        // System.out.println("Размеры box1: " + box1.getWidth() + " x " + box1.getHeight() + " x " + box1.getDepth());

        // Проверка на null перед доступом к объекту
        if (box1 != null) {
            System.out.println("Размеры box1: " + box1.getWidth() + " x " + box1.getHeight() + " x " + box1.getDepth());
        } else {
            System.out.println("Ссылка box1 содержит null");
        }
    }
}

class Box {
    private int width;
    private int height;
    private int depth;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
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

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}