package Lesson_14;

public class Task_14_1 {
    public static void main(String[] args) {
        // Створення рядків
        String hello1 = "Hello World!!!";
        String hello2 = new String("Hello World!!!");

        // Порівняння рядків
        boolean isEqual = hello1.equals(hello2);
        System.out.println("Рядки рівні: " + isEqual);

        // Конкатенація рядків
        String concatenated = hello1 + " " + hello2;
        System.out.println("Конкатенація рядків: " + concatenated);

        // Визначення довжини рядка
        int length = hello1.length();
        System.out.println("Довжина рядка: " + length);

        // Підрядки
        String substring = hello1.substring(6);
        System.out.println("Підрядок: " + substring);

        // Використання StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" World!!!");
        String result = stringBuilder.toString();
        System.out.println("Результат з використанням StringBuilder: " + result);
    }
}