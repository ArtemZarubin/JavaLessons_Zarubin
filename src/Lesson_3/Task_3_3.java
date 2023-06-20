package Lesson_3;

public class Task_3_3 {
    public static void main(String[] args) {
        // Вирази
        int a = 5;
        int b = 3;
        int sum = a + b;
        int product = a * b;

        // Блоки
        {
            int x = 10;
            System.out.println(x); // Виведе 10
        }

        // Керуючі оператори
        int number = 7;
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }

        int x = 2;
        switch (x) {
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
                break;
            default:
                System.out.println("x is neither 1 nor 2");
        }

        // Оператор return
        int result = multiply(3, 4);
        System.out.println(result); // Виведе 12
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}