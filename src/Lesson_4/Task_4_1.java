package Lesson_4;

public class Task_4_1 {
    public static void main(String[] args) {
        printMessage("Hello, World!"); // Виклик методу з одним параметром
        printNumbers(1, 2, 3, 4, 5); // Виклик методу зі змінною кількістю параметрів
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printNumbers(int... numbers) {
        System.out.println("Number of arguments: " + numbers.length);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}