package Lesson_5;

public class Task_5_1 {
    // Область видимости класса

    public static void main(String[] args) {
        // Область видимости метода

        int x = 5; // Локальная переменная

        {
            // Начало блока

            int y = 10; // Локальная переменная в блоке

            System.out.println("Значение x: " + x); // Обращение к переменной x из метода
            System.out.println("Значение y: " + y); // Обращение к переменной y из блока

            int z = 15; // Локальная переменная в блоке
            System.out.println("Значение z: " + z); // Обращение к переменной z из блока

            // Конец блока
        }

        System.out.println("Значение x: " + x); // Обращение к переменной x из метода
    }
}