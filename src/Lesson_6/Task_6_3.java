package Lesson_6;

public class Task_6_3 {
    public static void main(String[] args) {
        // Создание объекта
        MyClass obj1 = new MyClass();

        // Присваивание null ссылке
        MyClass obj2 = null;

        // Присваивание obj1 ссылки obj2
        obj2 = obj1;

        // Присваивание null ссылке
        obj1 = null;

        // Вызов сборщика мусора
        System.gc();
    }
}

class MyClass {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Объект уничтожен");
    }
}