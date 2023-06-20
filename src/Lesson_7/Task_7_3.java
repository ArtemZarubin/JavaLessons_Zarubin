package Lesson_7;

public class Task_7_3 {
    private static int staticVariable = 10; // Статическая переменная класса
    private int instanceVariable; // Переменная экземпляра класса

    public static void main(String[] args) {
        Task_7_3 obj1 = new Task_7_3();
        obj1.instanceMethod();

        Task_7_3 obj2 = new Task_7_3();
        obj2.instanceMethod();

        System.out.println("Static Variable: " + staticVariable);

        obj1.staticVariable = 20; // Изменение значения статической переменной через объект obj1

        System.out.println("Static Variable: " + staticVariable);

        obj2.instanceVariable = 5; // Изменение значения переменной экземпляра через объект obj2

        System.out.println("Instance Variable (obj1): " + obj1.instanceVariable);
        System.out.println("Instance Variable (obj2): " + obj2.instanceVariable);

        final int finalVariable = 50; // Константная переменная

        System.out.println("Final Variable: " + finalVariable);
    }

    public void instanceMethod() {
        int localVariable = 30; // Локальная переменная метода

        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Local Variable: " + localVariable);

        this.instanceVariable = 15; // Использование ключевого слова this для доступа к переменной экземпляра
    }
}