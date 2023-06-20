package Lesson_3;

public class Task_3_4 {
    public static void main(String[] args) {
        // Особливості роботи з цілими типами
        int x = -2147483648;
        int y = -x;
        boolean result1 = (y == x);    // true
        boolean result2 = (x == -x);   // true

        int a = 300000;
        int b = a * a;
        System.out.println(b);         // -194313216

        // Розширення цілих типів
        int i = 300000;
        System.out.println(i * i);     // -194313216

        long m = i;
        System.out.println(m * m);     // 90000000000
        System.out.println(1 / (m - i));  // ArithmeticException: divide by zero

        // Особливості роботи з дробовими типами
        double xyz = 1.0 / 2.0;
        System.out.println(xyz);         // 0.5

        System.out.println(1000 * 60 * 60 * 24 * 30);  // -1702967296

        byte byc = 5;
        byte c = (byte)(-byc);

        // Приведення примітивних типів даних
        int xor = (int) 3957.229;
        System.out.println("int xor = " + xor);   // int xor = 3957
    }
}