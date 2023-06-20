package Lesson_3;

public class Task_3_2 {
    public static void main(String[] args) {
        // Простий оператор присвоєння
        int cadence = 0;
        int speed = 0;
        int gear = 1;

        // Арифметичні операції
        int result = 1 + 2;
        result = result - 1;
        result = result * 2;
        result = result / 2;
        result = result + 8;
        result = result % 7;

        // Унарні операції
        int i = 3;
        i++;
        System.out.println(i); // Виведе 4
        ++i;
        System.out.println(i); // Виведе 5
        System.out.println(++i); // Виведе 6
        System.out.println(i++); // Виведе 6, а потім збільшить до 7
        System.out.println(i); // Виведе 7

        // Оператори рівності і відношення
        boolean isEqual = (result == 10);
        boolean isGreater = (result > 5);

        // Логічні оператори
        boolean logicalAnd = (isEqual && isGreater);
        boolean logicalOr = (isEqual || isGreater);

        // Комбіновані операції
        int x = 5;
        x += 2; // Еквівалентно x = x + 2

        // Побітові операції
        int a = 5; // Бінарне представлення: 0101
        int b = 3; // Бінарне представлення: 0011
        int bitwiseOr = a | b; // Результат: 0111 (7 в десятковій)
        int bitwiseAnd = a & b; // Результат: 0001 (1 в десятковій)
        int bitwiseXor = a ^ b; // Результат: 0110 (6 в десятковій)
        int bitwiseComplement = ~a; // Результат: 1010 (-6 в десятковій)

        // Зсуви бітів
        int number = 10; // Бінарне представлення: 0000 1010
        int leftShift = number << 2; // Результат: 0010 1000 (40 в десятковій)
        int rightShift = number >> 1; // Результат: 0000 0101 (5 в десятковій)
        int unsignedRightShift = number >>> 1; // Результат: 0000 0101 (5 в десятковій)

        // Умовні операції
        int condition = (isEqual) ? 10 : 20; // Якщо isEqual дорівнює true, то condition = 10, інакше condition = 20

        // Виведення результатів
        System.out.println(condition);
        System.out.println(bitwiseOr);
        System.out.println(bitwiseAnd);
        System.out.println(bitwiseXor);
        System.out.println(bitwiseComplement);
        System.out.println(leftShift);
        System.out.println(rightShift);
        System.out.println(unsignedRightShift);
    }
}