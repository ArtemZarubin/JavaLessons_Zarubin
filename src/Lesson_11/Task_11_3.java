package Lesson_11;

class Parent {
    private void privateMethod() {
        System.out.println("Це приватний метод батьківського класу");
    }

    public void publicMethod() {
        System.out.println("Це публічний метод батьківського класу");
    }

    public void accessPrivateMethod() {
        privateMethod(); // Доступ до приватного методу зсередини батьківського класу
    }
}

class Child extends Parent {
    private void privateMethod() {
        System.out.println("Це приватний метод дочірнього класу");
    }

    @Override
    public void publicMethod() {
        System.out.println("Це перевизначений публічний метод у дочірньому класі");
    }

    public void accessPrivateMethod() {
        privateMethod(); // Доступ до приватного методу зсередини дочірнього класу
    }
}

public class Task_11_3 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.publicMethod(); // Виведе: "Це публічний метод батьківського класу"
        // parent.privateMethod(); // Помилка компіляції - приватний метод недоступний зовні класу

        Child child = new Child();
        child.publicMethod(); // Виведе: "Це перевизначений публічний метод у дочірньому класі"
        // child.privateMethod(); // Помилка компіляції - приватний метод недоступний зовні класу
        child.accessPrivateMethod(); // Виведе: "Це приватний метод дочірнього класу"
    }
}