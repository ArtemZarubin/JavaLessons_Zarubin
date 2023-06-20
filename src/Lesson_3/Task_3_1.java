package Lesson_3;

public class Task_3_1 {
    public static void main(String[] args) {
        // Оголошення змінних
        int number; // оголошення цілочисельної змінної
        double pi = 3.14; // оголошення та ініціалізація дійсної змінної
        String name = "John"; // оголошення та ініціалізація рядкової змінної

        // Використання змінних
        number = 10; // присвоєння значення змінній
        System.out.println("Number: " + number);
        System.out.println("PI: " + pi);
        System.out.println("Name: " + name);

        // Масиви
        int[] numbers = new int[5]; // оголошення масиву цілих чисел з розміром 5
        numbers[0] = 1; // ініціалізація елементу масиву
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 1: " + numbers[1]);
        System.out.println("Element at index 2: " + numbers[2]);
        System.out.println("Element at index 3: " + numbers[3]);
        System.out.println("Element at index 4: " + numbers[4]);

        // Багатовимірні масиви
        int[][] matrix = new int[3][3]; // оголошення двовимірного масиву
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
        System.out.println("Element at row 0, column 0: " + matrix[0][0]);
        System.out.println("Element at row 1, column 1: " + matrix[1][1]);
        System.out.println("Element at row 2, column 2: " + matrix[2][2]);
    }
}