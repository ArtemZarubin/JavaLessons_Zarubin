package Lesson_15;

public class Task_15_2 {

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        try {
            int result = divide(dividend, divisor);
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Виникла помилка арифметичного обчислення: " + e.getMessage());
        } finally {
            System.out.println("Блок finally завжди виконується незалежно від наявності помилки.");
        }
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Ділення на нуль неможливе.");
        }
        return dividend / divisor;
    }
}