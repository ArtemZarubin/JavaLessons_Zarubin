package Lesson_9;

public class Task_9_1 {
    private int x;
    private static int y;

    // Блок ініціалізації класу
    static {
        // Ініціалізація статичних полів
        y = 5;
        System.out.println("Статичний блок ініціалізації. y = " + y);
    }

    // Блок ініціалізації об'єкта
    {
        // Ініціалізація полів екземпляра
        x = 10;
        System.out.println("Блок ініціалізації об'єкта. x = " + x);
    }

    // Конструктор
    public Task_9_1() {
        System.out.println("Конструктор класу");
    }

    public static void main(String[] args) {
        Task_9_1 example = new Task_9_1();
    }
}