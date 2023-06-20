package Lesson_1;

// Пример класса "Собака"
class Dog {
    // Поля класса
    private String name;
    private int age;

    // Конструктор класса
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Методы класса
    public void bark() {
        System.out.println("Гав-гав!");
    }

    public void run(int distance) {
        System.out.println(name + " пробежала " + distance + " метров.");
    }

    // Метод доступа к полю "name"
    public String getName() {
        return name;
    }

    // Метод доступа к полю "age"
    public int getAge() {
        return age;
    }
}

// Главный класс программы
public class Task_1_1 {
    public static void main(String[] args) {
        // Создание объекта класса "Собака"
        Dog dog = new Dog("Барон", 3);

        // Вызов методов объекта и доступ к полям
        dog.bark();
        dog.run(100);

        System.out.println("Имя собаки: " + dog.getName());
        System.out.println("Возраст собаки: " + dog.getAge() + " года");
    }
}