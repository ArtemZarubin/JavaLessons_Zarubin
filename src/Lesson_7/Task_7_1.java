package Lesson_7;

public class Task_7_1 {
    public static void main(String[] args) {
        Task_7_1 example = new Task_7_1();

        boolean shouldPrint = false;
        example.print(shouldPrint);

        double a = 2.5;
        double b = 3.0;
        double c = 4.0;
        double volume = example.getVolume(a, b, c);
        System.out.println("Volume: " + volume);
    }

    public void print(boolean shouldPrint) {
        if (!shouldPrint) {
            return;
        }
        System.out.println("Test");
    }

    public double getVolume(double a, double b, double c) {
        double volume = a * b * c;
        return volume;
    }
}