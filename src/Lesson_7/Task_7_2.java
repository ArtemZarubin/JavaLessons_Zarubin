package Lesson_7;

public class Task_7_2 {
    public static void main(String[] args) {
        Task_7_2 math = new Task_7_2();

        int a = 10;
        int b = 5;

        int sum = math.add(a, b);
        System.out.println("Sum: " + sum);

        int difference = math.subtract(a, b);
        System.out.println("Difference: " + difference);

        double product = math.multiply(a, b);
        System.out.println("Product: " + product);

        double quotient = math.divide(a, b);
        System.out.println("Quotient: " + quotient);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: Division by zero!");
            return 0.0;
        }
    }
}