package Lesson_16;

public class Task_16_2 {
    public static void main(String[] args) {
        // Автоупаковка та авторозпаковка
        Integer num1 = 10; // Автоупаковка
        int num2 = num1; // Авторозпаковка

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        // Математичні операції
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = num1 / (double) num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Використання класів-обгорток
        Integer intValue = Integer.valueOf("100"); // Перетворення рядка в Integer
        int intValueUnboxed = intValue.intValue(); // Отримання примітивного типу

        System.out.println("intValue: " + intValue);
        System.out.println("intValueUnboxed: " + intValueUnboxed);

        // Використання класу Math
        double squareRoot = Math.sqrt(intValueUnboxed);
        double power = Math.pow(intValueUnboxed, 2);

        System.out.println("Square root: " + squareRoot);
        System.out.println("Power: " + power);
    }
}